package com.hazfutbol.tournaments.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.hazfutbol.tournaments.bean.TournamentPhase;
import com.hazfutbol.tournaments.dao.TournamentPhaseDAO;
import com.hazfutbol.tournaments.util.MySqlConnection;

public class TournamentPhaseDAOImpl implements TournamentPhaseDAO {

	@Override
	public List<Map<String, Object>> listPhasesByTornament(int nIdTournament) {

		Connection connection = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		List<Map<String, Object>> tournamentPhases = null;

		try {
			connection = MySqlConnection.getConnection();

			String query = "SELECT pt.n_id_phase_tournament, pt.n_id_stage, pt.c_name_phase_tournament, "
					+ "ts.n_id_stage_type, pt.n_quantity_groups_phase, "
					+ "pt.n_quantity_teams_by_group_phase, pt.n_quantity_winners_phase, tpp.c_drag_cards, "
					+ "tpp.c_drag_suspensions, pt.n_quantity_teams, pt.n_index_phase_by_tournament, pt.c_description_phase "
					+ "FROM hf_phase_tournament pt INNER JOIN hf_tournament_stage ts "
					+ "ON pt.n_id_stage = ts.n_id_stage INNER JOIN hf_tournament_policy_phase tpp "
					+ "ON pt.n_id_phase_tournament = tpp.n_id_phase_tournament "
					+ "WHERE pt.n_id_stage IN (SELECT n_id_stage " + "FROM hf_tournament_stage "
					+ "WHERE n_id_tournament = ?) AND pt.c_status_phase_tournament = 'visible' "
					+ "ORDER BY pt.n_index_phase_by_tournament asc;";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, nIdTournament);
			tournamentPhases = new ArrayList<>();
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Map<String, Object> tournamentPhase = new HashMap<>();

				TournamentPhase phase = new TournamentPhase();
				phase.setnIdPhaseTournament(resultSet.getInt("n_id_phase_tournament"));
				phase.setnIdStage(resultSet.getInt("n_id_stage"));
				phase.setcNamePhaseTournament(resultSet.getString("c_name_phase_tournament"));
				phase.setnQuantityGroupsPhase(resultSet.getInt("n_quantity_groups_phase"));
				phase.setnQuantityTeamsByGroupPhase(resultSet.getInt("n_quantity_teams_by_group_phase"));
				phase.setnQuantityWinnersPhase(resultSet.getInt("n_quantity_winners_phase"));
				phase.setnQuantityTeams(resultSet.getInt("n_quantity_teams"));
				phase.setnIndexPhaseByTournament(resultSet.getInt("n_index_phase_by_tournament"));
				phase.setcDescriptionPhase(resultSet.getString("c_description_phase"));
				tournamentPhase.put("phase", phase);
				tournamentPhase.put("stageType", resultSet.getInt("n_id_stage_type"));
				tournamentPhase.put("dragCards", resultSet.getString("c_drag_cards"));
				tournamentPhase.put("dragSuspensions", resultSet.getString("c_drag_suspensions"));

				tournamentPhases.add(tournamentPhase);
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
		return tournamentPhases;
	}

	@Override
	public int saveTournamentPhases(List<Map<String, Object>> tournamentPhases) {

		Connection connection = null;
		PreparedStatement preparedStatement1 = null;
		PreparedStatement preparedStatement2 = null;
		PreparedStatement preparedStatement3 = null;
		int rowsUpdated = 0;
		// n_quantity_groups_phase=?, n_quantity_teams_by_group_phase=?,
		try {
			connection = MySqlConnection.getConnection();
			connection.setAutoCommit(false);
			String query1 = "UPDATE hf_phase_tournament " + "SET c_name_phase_tournament=?, "
					+ "n_quantity_teams=?, c_description_phase=?, n_quantity_winners_phase=?, "
					+ "d_date_update_phase_tournament=? " + "WHERE n_id_phase_tournament=?; ";

			String query2 = "UPDATE hf_tournament_stage " + "SET n_id_stage_type=?, d_date_update_stage=? "
					+ "WHERE n_id_stage=?;";

			String query3 = "UPDATE hf_tournament_policy_phase "
					+ "SET c_drag_cards=?, c_drag_suspensions=?, d_date_update_policy_phase=? "
					+ "WHERE n_id_phase_tournament=?;";

			preparedStatement1 = connection.prepareStatement(query1);
			preparedStatement2 = connection.prepareStatement(query2);
			preparedStatement3 = connection.prepareStatement(query3);
			Date today = new Date();
			Gson gson = new Gson();
			for (Map<String, Object> tournamentPhase : tournamentPhases) {

				JsonElement jsonElement = gson.toJsonTree(tournamentPhase.get("phase"));
				TournamentPhase phase = gson.fromJson(jsonElement, TournamentPhase.class);

				@SuppressWarnings("unchecked")
				Map<String, Object> extraData = (Map<String, Object>) tournamentPhase.get("extraData");

				preparedStatement1.setString(1, phase.getcNamePhaseTournament());
				preparedStatement1.setInt(2, phase.getnQuantityTeams());
				preparedStatement1.setString(3, phase.getcDescriptionPhase());
				preparedStatement1.setInt(4, phase.getnQuantityWinnersPhase());
				preparedStatement1.setDate(5, new java.sql.Date(today.getTime()));
				preparedStatement1.setInt(6, phase.getnIdPhaseTournament());
				preparedStatement1.addBatch();

				preparedStatement2.setInt(1, Integer.valueOf(extraData.get("stageType").toString()));
				preparedStatement2.setDate(2, new java.sql.Date(today.getTime()));
				preparedStatement2.setInt(3, phase.getnIdStage());
				preparedStatement2.addBatch();

				preparedStatement3.setString(1, extraData.get("dragCards").toString());
				preparedStatement3.setString(2, extraData.get("dragSuspensions").toString());
				preparedStatement3.setDate(3, new java.sql.Date(today.getTime()));
				preparedStatement3.setInt(4, phase.getnIdPhaseTournament());
				preparedStatement3.addBatch();

			}
			rowsUpdated += preparedStatement1.executeBatch().length;
			rowsUpdated += preparedStatement2.executeBatch().length;
			rowsUpdated += preparedStatement3.executeBatch().length;

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
				if (preparedStatement1 != null)
					preparedStatement1.close();
				if (preparedStatement2 != null)
					preparedStatement2.close();
				if (preparedStatement3 != null)
					preparedStatement3.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rowsUpdated;
	}

}
