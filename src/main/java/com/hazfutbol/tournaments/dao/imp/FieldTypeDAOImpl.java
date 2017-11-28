package com.hazfutbol.tournaments.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hazfutbol.tournaments.bean.FieldType;
import com.hazfutbol.tournaments.dao.FieldTypeDAO;
import com.hazfutbol.tournaments.util.MySqlConnection;

public class FieldTypeDAOImpl implements FieldTypeDAO {

	@Override
	public List<FieldType> listFieldTypes() {
		Connection connection = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		List<FieldType> fieldTypes = null;

		try {
			connection = MySqlConnection.getConnection();

			String query = "SELECT field_type_id, field_type_name, field_type_name_group " + "FROM hf_field_type "
					+ "WHERE status = 1;";

			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			fieldTypes = new ArrayList<>();
			while (resultSet.next()) {
				FieldType fieldType = new FieldType();
				fieldType.setFieldTypeId(resultSet.getInt("field_type_id"));
				fieldType.setFieldTypeName(resultSet.getString("field_type_name"));
				fieldType.setFieldTypeNameGroup(resultSet.getString("field_type_name_group"));

				fieldTypes.add(fieldType);
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
		return fieldTypes;
	}

}
