package com.hazfutbol.tournaments.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.hazfutbol.tournaments.bean.TournamentPolicyFault;
import com.hazfutbol.tournaments.dao.TournamentPolicyFaultDAO;
import com.hazfutbol.tournaments.util.MySqlConnection;

public class TournamentPolicyFaultDAOImpl implements TournamentPolicyFaultDAO {

	@Override
	public TournamentPolicyFault tournamentFaultPolicies(int nIdTournament) {
		Connection connection = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		TournamentPolicyFault tournamentPolicyFault = null;

		try {
			connection = MySqlConnection.getConnection();

			tournamentPolicyFault = new TournamentPolicyFault();
			String query = "SELECT n_id_match_fault, n_card_yellow_by_match_for_card_red_indirect, "
					+ "n_card_yellow_accumulated_for_match_suspension, n_suspension_for_card_red_direct, "
					+ "n_suspension_for_card_red_indirect " + "FROM hf_tournament_policy_match_fault "
					+ "WHERE n_id_tournament = ?;";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, nIdTournament);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				tournamentPolicyFault.setnIdMatchFault(resultSet.getInt("n_id_match_fault"));
				tournamentPolicyFault.setnCardYellowByMatchForCardRedIndirect(
						resultSet.getInt("n_card_yellow_by_match_for_card_red_indirect"));
				tournamentPolicyFault.setnCardYellowAccumulatedForMatchSuspension(
						resultSet.getInt("n_card_yellow_accumulated_for_match_suspension"));
				tournamentPolicyFault
						.setnSuspensionForCardRedDirect(resultSet.getInt("n_suspension_for_card_red_direct"));
				tournamentPolicyFault
						.setnSuspensionForCardRedIndirect(resultSet.getInt("n_suspension_for_card_red_indirect"));
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
		return tournamentPolicyFault;
	}

	@Override
	public int saveTournamentPolicyFault(TournamentPolicyFault tournamentPolicyFault) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rowsUpdated = 0;

		try {
			connection = MySqlConnection.getConnection();
			String query = "UPDATE hf_tournament_policy_match_fault "
					+ "SET n_card_yellow_by_match_for_card_red_indirect=?, n_card_yellow_accumulated_for_match_suspension=?, "
					+ "n_suspension_for_card_red_direct=?, n_suspension_for_card_red_indirect=?, "
					+ "d_date_update_policy_match_fault=? " + "WHERE n_id_match_fault=?;";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, tournamentPolicyFault.getnCardYellowByMatchForCardRedIndirect());
			preparedStatement.setInt(2, tournamentPolicyFault.getnCardYellowAccumulatedForMatchSuspension());
			preparedStatement.setInt(3, tournamentPolicyFault.getnSuspensionForCardRedDirect());
			preparedStatement.setInt(4, tournamentPolicyFault.getnSuspensionForCardRedIndirect());
			preparedStatement.setDate(5, new java.sql.Date(new Date().getTime()));
			preparedStatement.setInt(6, tournamentPolicyFault.getnIdMatchFault());

			rowsUpdated = preparedStatement.executeUpdate();
		}

		catch (SQLException e) {
			e.printStackTrace();
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
