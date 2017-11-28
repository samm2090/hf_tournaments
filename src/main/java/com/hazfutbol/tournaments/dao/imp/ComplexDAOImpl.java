package com.hazfutbol.tournaments.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hazfutbol.tournaments.bean.Complex;
import com.hazfutbol.tournaments.dao.ComplexDAO;
import com.hazfutbol.tournaments.util.MySqlConnection;

public class ComplexDAOImpl implements ComplexDAO {

	@Override
	public List<Complex> listComplexes() {
		Connection connection = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		List<Complex> complexes = null;

		try {
			connection = MySqlConnection.getConnection();

			String query = "SELECT complex_id, name " + "FROM hf_complex " + "WHERE status = 1 " + "ORDER BY name asc;";

			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			complexes = new ArrayList<>();
			while (resultSet.next()) {
				Complex complex = new Complex();
				complex.setComplexId(resultSet.getInt("complex_id"));
				complex.setName(resultSet.getString("name"));

				complexes.add(complex);
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return complexes;
	}

	@Override
	public List<String> listComplexesNames() {
		Connection connection = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		List<String> complexes = null;

		try {
			connection = MySqlConnection.getConnection();

			String query = "SELECT name " + "FROM hf_complex " + "WHERE status = 1 " + "ORDER BY name asc;";

			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			complexes = new ArrayList<>();
			while (resultSet.next()) {
				complexes.add(resultSet.getString("name"));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return complexes;
	}

}
