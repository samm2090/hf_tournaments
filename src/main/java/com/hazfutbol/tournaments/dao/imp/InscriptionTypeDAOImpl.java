package com.hazfutbol.tournaments.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hazfutbol.tournaments.bean.InscriptionType;
import com.hazfutbol.tournaments.dao.InscriptionTypeDAO;
import com.hazfutbol.tournaments.util.MySqlConnection;

public class InscriptionTypeDAOImpl implements InscriptionTypeDAO {

	@Override
	public List<InscriptionType> listInscriptionTypes() {

		Connection connection = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		List<InscriptionType> inscriptionTypes = null;

		try {
			connection = MySqlConnection.getConnection();

			String query = "SELECT n_id_inscription_type, c_name_inscription_type, "
					+ "c_description_inscription_type, c_status_inscription_type "
					+ "FROM hf_tournament_inscription_type " + "WHERE c_status_inscription_type = 'visible';";

			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			inscriptionTypes = new ArrayList<>();
			while (resultSet.next()) {
				InscriptionType inscriptionType = new InscriptionType();
				inscriptionType.setnIdInscriptionType(resultSet.getInt("n_id_inscription_type"));
				inscriptionType.setcNameInscriptionType(resultSet.getString("c_name_inscription_type"));
				inscriptionType.setcDescriptionInscriptionType(resultSet.getString("c_description_inscription_type"));
				inscriptionType.setcStatusInscriptionType(resultSet.getString("c_status_inscription_type"));

				inscriptionTypes.add(inscriptionType);
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
		return inscriptionTypes;
	}

}
