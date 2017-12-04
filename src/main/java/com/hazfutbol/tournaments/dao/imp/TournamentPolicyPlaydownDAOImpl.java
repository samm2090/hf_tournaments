package com.hazfutbol.tournaments.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.hazfutbol.tournaments.bean.TournamentPolicyPlaydown;
import com.hazfutbol.tournaments.dao.TournamentPolicyPlaydownDAO;
import com.hazfutbol.tournaments.util.MySqlConnection;

public class TournamentPolicyPlaydownDAOImpl implements TournamentPolicyPlaydownDAO {

	@Override
	public List<TournamentPolicyPlaydown> listTournamentPlaydownPolicies(int nIdTournament) {
		Connection connection = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		List<TournamentPolicyPlaydown> tournamentPolicyPlaydowns = null;

		try {
			connection = MySqlConnection.getConnection();

			String query = "SELECT n_id_policy_match_playdown, n_id_policy_match_playdown_type, "
					+ "n_index_policy_match_playdown " + "FROM hf_tournament_policy_match_playdown "
					+ "WHERE n_id_tournament = ? AND n_id_policy_match_playdown_type IN(3,4,5,14);";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, nIdTournament);
			resultSet = preparedStatement.executeQuery();

			tournamentPolicyPlaydowns = new ArrayList<>();
			while (resultSet.next()) {
				TournamentPolicyPlaydown tournamentPolicyPlaydown = new TournamentPolicyPlaydown();

				tournamentPolicyPlaydown.setnIdPolicyMatchPlaydown(resultSet.getInt("n_id_policy_match_playdown"));
				tournamentPolicyPlaydown
						.setnIdPolicyMatchPlaydownType(resultSet.getInt("n_id_policy_match_playdown_type"));
				tournamentPolicyPlaydown
						.setnIndexPolicyMatchPlaydown(resultSet.getInt("n_index_policy_match_playdown"));

				tournamentPolicyPlaydowns.add(tournamentPolicyPlaydown);
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
		return tournamentPolicyPlaydowns;
	}

	@Override
	public int saveTournamentPolicyPlaydown(Map<String, Object> tournamentPolicyPlaydowns) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rowsUpdated = 0;
		// n_quantity_groups_phase=?, n_quantity_teams_by_group_phase=?,
		try {
			connection = MySqlConnection.getConnection();
			connection.setAutoCommit(false);
			String query = "UPDATE hf_tournament_policy_match_playdown "
					+ "SET n_index_policy_match_playdown=?, d_date_update_policy_match_playdown=? "
					+ "WHERE n_id_policy_match_playdown=?;";

			preparedStatement = connection.prepareStatement(query);

			for (String key : tournamentPolicyPlaydowns.keySet()) {

				@SuppressWarnings("unchecked")
				Map<String, Object> policyPlaydown = (Map<String, Object>) tournamentPolicyPlaydowns.get(key);

				boolean checked = (boolean) policyPlaydown.get("chknIndexPolicyMatchPlaydown");

				if (checked) {
					preparedStatement.setInt(1,
							Integer.valueOf(policyPlaydown.get("nIndexPolicyMatchPlaydown").toString()));
					preparedStatement.setDate(2, new java.sql.Date(new Date().getTime()));
					preparedStatement.setInt(3,
							Integer.valueOf(policyPlaydown.get("nIdPolicyMatchPlaydown").toString()));
					preparedStatement.addBatch();
				}
			}

			rowsUpdated = preparedStatement.executeBatch().length;
			connection.commit();
		}

		catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rowsUpdated;
	}

}
