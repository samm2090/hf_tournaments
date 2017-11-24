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
		Connection connection = MySqlConnection.getConnection();
		List<Complex> complexes = null;

		try {
			String query = "SELECT complex_id, name " + "FROM hf_complex " + "WHERE status = 1 " + "ORDER BY name asc;";

			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();

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
		}
		return complexes;
	}

}
