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

		Connection connection = MySqlConnection.getConnection();
		List<TeamPlayer> teamPlayerOptions = null;

		try {
			String query = "SELECT team_player_id, quantity, name " + "FROM hf_team_player "
					+ "WHERE status = 1 ORDER BY quantity asc;";

			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();

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
		}
		return teamPlayerOptions;
	}

}
