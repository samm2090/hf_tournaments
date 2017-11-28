package com.hazfutbol.tournaments.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hazfutbol.tournaments.bean.FootballCategory;
import com.hazfutbol.tournaments.dao.FootballCategoryDAO;
import com.hazfutbol.tournaments.util.MySqlConnection;

public class FootballCategoryDAOImpl implements FootballCategoryDAO {

	@Override
	public List<FootballCategory> listFootballCatogories() {

		Connection connection = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		List<FootballCategory> footballCategories = null;

		try {
			connection = MySqlConnection.getConnection();

			String query = "SELECT football_category_id, name " + "FROM hf_football_category;";

			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			footballCategories = new ArrayList<>();
			while (resultSet.next()) {
				FootballCategory footballCategory = new FootballCategory();
				footballCategory.setFootballCategoryId(resultSet.getInt("football_category_id"));
				footballCategory.setName(resultSet.getString("name"));

				footballCategories.add(footballCategory);
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
		return footballCategories;
	}

}
