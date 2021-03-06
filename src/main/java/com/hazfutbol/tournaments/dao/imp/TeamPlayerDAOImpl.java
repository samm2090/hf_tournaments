package com.hazfutbol.tournaments.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hazfutbol.tournaments.bean.TeamPlayer;
import com.hazfutbol.tournaments.dao.TeamPlayerDAO;
import com.hazfutbol.tournaments.util.MySqlConnection;

public class TeamPlayerDAOImpl implements TeamPlayerDAO {

	@Override
	public List<TeamPlayer> listTeamPlayerOptions() {

		Connection connection = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		List<TeamPlayer> teamPlayerOptions = null;

		try {
			connection = MySqlConnection.getConnection();

			String query = "SELECT team_player_id, quantity, name " + "FROM hf_team_player "
					+ "WHERE status = 1 ORDER BY quantity asc;";

			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			teamPlayerOptions = new ArrayList<>();
			while (resultSet.next()) {
				TeamPlayer teamPlayerOption = new TeamPlayer();
				teamPlayerOption.setTeamPlayerId(resultSet.getInt("team_player_id"));
				teamPlayerOption.setQuantity(resultSet.getInt("quantity"));
				teamPlayerOption.setName(resultSet.getString("name"));

				teamPlayerOptions.add(teamPlayerOption);
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
		return teamPlayerOptions;
	}

}
