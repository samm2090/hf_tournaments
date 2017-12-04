package com.hazfutbol.tournaments.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.hazfutbol.tournaments.bean.TournamentPolicyScore;
import com.hazfutbol.tournaments.dao.TournamentPolicyScoreDAO;
import com.hazfutbol.tournaments.util.MySqlConnection;

public class TournamentPolicyScoreDAOImpl implements TournamentPolicyScoreDAO {

	@Override
	public TournamentPolicyScore tournamentScorePolicies(int nIdTournament) {
		Connection connection = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		TournamentPolicyScore tournamentPolicyScore = null;

		try {
			connection = MySqlConnection.getConnection();
			tournamentPolicyScore = new TournamentPolicyScore();
			String query = "SELECT n_id_policy_match_score, n_win_without_supplementary_time, n_lose_without_supplementary_time, "
					+ "n_win_with_supplementary_time, n_lose_with_supplementary_time, "
					+ "n_win_with_penalty_goals, n_lose_with_penalty_goals, "
					+ "n_win_with_toss_up, n_lose_with_toss_up, n_goals_draw, "
					+ "n_win_with_walkover, n_lose_with_walkover, "
					+ "n_win_with_walkover_goal_added, n_lose_with_walkover_goal_added "
					+ "FROM hf_tournament_policy_match_score " + "WHERE n_id_tournament = ?;";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, nIdTournament);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				tournamentPolicyScore.setnIdPolicyMatchScore(resultSet.getInt("n_id_policy_match_score"));
				tournamentPolicyScore
						.setnWinWithoutSupplementaryTime(resultSet.getInt("n_win_without_supplementary_time"));
				tournamentPolicyScore
						.setnLoseWithoutSupplementaryTime(resultSet.getInt("n_lose_without_supplementary_time"));
				tournamentPolicyScore.setnWinWithSupplementaryTime(resultSet.getInt("n_win_with_supplementary_time"));
				tournamentPolicyScore.setnLoseWithSupplementaryTime(resultSet.getInt("n_lose_with_supplementary_time"));
				tournamentPolicyScore.setnWinWithPenaltyGoals(resultSet.getInt("n_win_with_penalty_goals"));
				tournamentPolicyScore.setnLoseWithPenaltyGoals(resultSet.getInt("n_lose_with_penalty_goals"));
				tournamentPolicyScore.setnWinWithTossUp(resultSet.getInt("n_win_with_toss_up"));
				tournamentPolicyScore.setnLoseWithTossUp(resultSet.getInt("n_lose_with_toss_up"));
				tournamentPolicyScore.setnGoalsDraw(resultSet.getInt("n_goals_draw"));
				tournamentPolicyScore.setnWinWithWalkover(resultSet.getInt("n_win_with_walkover"));
				tournamentPolicyScore.setnLoseWithWalkover(resultSet.getInt("n_win_with_walkover"));
				tournamentPolicyScore.setnLoseWithTossUp(resultSet.getInt("n_lose_with_walkover"));
				tournamentPolicyScore.setnWinWithWalkoverGoalAdded(resultSet.getInt("n_win_with_walkover_goal_added"));
				tournamentPolicyScore
						.setnLoseWithWalkoverGoalAdded(resultSet.getInt("n_lose_with_walkover_goal_added"));
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
		return tournamentPolicyScore;
	}

	@Override
	public int saveTournamentPolicyScore(TournamentPolicyScore tournamentPolicyScore) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rowsUpdated = 0;

		try {
			connection = MySqlConnection.getConnection();
			String query = "UPDATE hf_tournament_policy_match_score "
					+ "SET n_win_without_supplementary_time=?, n_lose_without_supplementary_time=?, "
					+ "n_win_with_supplementary_time=?, n_lose_with_supplementary_time=?, "
					+ "n_win_with_penalty_goals=?, n_lose_with_penalty_goals=?,"
					+ "n_win_with_toss_up=?, n_lose_with_toss_up=?, n_goals_draw=?, "
					+ "n_win_with_walkover=?, n_lose_with_walkover=?, "
					+ "n_win_with_walkover_goal_added=?, n_lose_with_walkover_goal_added=?, "
					+ "d_date_update_policy_match_score=? " + "WHERE n_id_policy_match_score=?;";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, tournamentPolicyScore.getnWinWithoutSupplementaryTime());
			preparedStatement.setInt(2, tournamentPolicyScore.getnLoseWithoutSupplementaryTime());
			preparedStatement.setInt(3, tournamentPolicyScore.getnWinWithSupplementaryTime());
			preparedStatement.setInt(4, tournamentPolicyScore.getnLoseWithSupplementaryTime());
			preparedStatement.setInt(5, tournamentPolicyScore.getnWinWithPenaltyGoals());
			preparedStatement.setInt(6, tournamentPolicyScore.getnLoseWithPenaltyGoals());
			preparedStatement.setInt(7, tournamentPolicyScore.getnWinWithTossUp());
			preparedStatement.setInt(8, tournamentPolicyScore.getnLoseWithTossUp());
			preparedStatement.setInt(9, tournamentPolicyScore.getnGoalsDraw());
			preparedStatement.setInt(10, tournamentPolicyScore.getnWinWithWalkover());
			preparedStatement.setInt(11, tournamentPolicyScore.getnLoseWithWalkover());
			preparedStatement.setInt(12, tournamentPolicyScore.getnWinWithWalkoverGoalAdded());
			preparedStatement.setInt(13, tournamentPolicyScore.getnLoseWithWalkoverGoalAdded());
			preparedStatement.setDate(14, new java.sql.Date(new Date().getTime()));
			preparedStatement.setInt(15, tournamentPolicyScore.getnIdPolicyMatchScore());

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
