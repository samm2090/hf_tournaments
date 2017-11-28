package com.hazfutbol.tournaments.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hazfutbol.tournaments.bean.City;
import com.hazfutbol.tournaments.dao.CityDAO;
import com.hazfutbol.tournaments.util.MySqlConnection;

public class CityDAOImpl implements CityDAO {

	@Override
	public List<City> listCities() {

		Connection connection = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		List<City> cities = null;

		try {
			connection = MySqlConnection.getConnection();

			String query = "select city_id, province_id, city_name from hf_city;";

			preparedStatement = connection.prepareStatement(query);

			cities = new ArrayList<City>();
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				City city = new City();
				city.setCityId(resultSet.getInt("city_id"));
				city.setProvinceId(resultSet.getInt("province_id"));
				city.setCityName(resultSet.getString("city_name"));
				cities.add(city);
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
		return cities;
	}

}
