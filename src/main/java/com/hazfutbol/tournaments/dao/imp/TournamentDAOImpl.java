package com.hazfutbol.tournaments.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hazfutbol.tournaments.bean.Tournament;
import com.hazfutbol.tournaments.dao.TournamentDAO;
import com.hazfutbol.tournaments.util.MySqlConnection;

public class TournamentDAOImpl implements TournamentDAO {

	@Override
	public List<Map<String, Object>> listTournamentsByManager(int nIdManagerTournament) {

		Connection connection = MySqlConnection.getConnection();
		List<Map<String, Object>> tournaments = null;

		try {
			String query = "SELECT t.n_id_tournament, t.c_name_tournament, t.n_id_type, mt.publicname, tp.name, t.d_date_tournament_start, "
					+ "t.numberofparticipantstournament, t.c_status_tournament "
					+ "FROM hf_tournament t INNER JOIN hf_user_tournament ut "
					+ "ON t.n_id_manager_tournament = ut.n_id_user_tournament INNER JOIN hf_usertournamentmanagerrelationship utmr "
					+ "ON ut.n_id_user_tournament = utmr.n_id_user_tournament INNER JOIN hf_manager_tournament mt "
					+ "ON utmr.managertournament_id = mt.managertournament_id INNER JOIN hf_team_player tp "
					+ "ON t.n_id_team_player = tp.team_player_id " + "WHERE t.n_id_manager_tournament = ? "
					+ "ORDER BY t.d_date_register_tournament DESC;";

			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, nIdManagerTournament);
			tournaments = new ArrayList<Map<String, Object>>();
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Map<String, Object> tournament = new HashMap<>();
				Tournament tournamentData = new Tournament();
				tournamentData.setnIdTournament(resultSet.getInt("n_id_tournament"));
				tournamentData.setcNameTournament(resultSet.getString("c_name_tournament"));
				tournamentData.setnIdType(resultSet.getInt("n_id_type"));
				tournamentData.setdDateTournamentStart(resultSet.getDate("d_date_tournament_start"));
				tournamentData.setNumberofparticipantstournament(resultSet.getInt("numberofparticipantstournament"));
				tournamentData.setcStatusTournament(resultSet.getString("c_status_tournament"));

				tournament.put("tournamentData", tournamentData);
				tournament.put("managerName", resultSet.getString("publicname"));
				tournament.put("soccerType", resultSet.getString("name"));

				tournaments.add(tournament);
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tournaments;
	}

	@Override
	public Map<String, Object> tournamentInformation(int nIdTournament) {

		Connection connection = MySqlConnection.getConnection();
		Map<String, Object> tournament = null;

		try {
			String query = "SELECT t.c_name_tournament, t.c_status_tournament, t.c_presentationtxt_tournament, mt.publicname, "
					+ "t.n_id_team_player, t.n_id_football_category, t.n_id_sex, t.d_date_tournament_start, "
					+ "t.d_date_tournament_finish, t.c_field_tournament, t.n_id_city_field_tournament, "
					+ "t.n_id_field_type, t.numberofparticipantstournament, t.n_id_inscription_type, "
					+ "t.c_price_team, t.c_inscription_payment_additional_text, t.c_email_tournament, "
					+ "t.c_phone_tournament, t.c_webpage_tournament, t.c_premiostxt_tournament, t.c_fechastxt_tournament, "
					+ "t.c_additionaltxt_tournament , t.n_id_type "
					+ "FROM hf_tournament t INNER JOIN hf_user_tournament ut "
					+ "ON t.n_id_manager_tournament = ut.n_id_user_tournament INNER JOIN hf_usertournamentmanagerrelationship utmr "
					+ "ON ut.n_id_user_tournament = utmr.n_id_user_tournament INNER JOIN hf_manager_tournament mt "
					+ "ON utmr.managertournament_id = mt.managertournament_id " + "WHERE t.n_id_tournament = ?;";
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, nIdTournament);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			tournament = new HashMap<>();
			if (resultSet.next()) {
				Tournament tournamentData = new Tournament();
				tournamentData.setcNameTournament(resultSet.getString("c_name_tournament"));
				tournamentData.setcStatusTournament(resultSet.getString("c_status_tournament"));
				tournamentData.setcPresentationtxtTournament(resultSet.getString("c_presentationtxt_tournament"));
				tournamentData.setnIdTeamPlayer(resultSet.getInt("n_id_team_player"));
				tournamentData.setnIdFootballCategory(resultSet.getInt("n_id_football_category"));
				tournamentData.setnIdSex(resultSet.getInt("n_id_sex"));
				tournamentData.setdDateTournamentStart(resultSet.getDate("d_date_tournament_start"));
				tournamentData.setdDateTournamentFinish(resultSet.getDate("d_date_tournament_finish"));
				tournamentData.setcFieldTournament(resultSet.getString("c_field_tournament"));
				tournamentData.setnIdCityFieldTournament(resultSet.getInt("n_id_city_field_tournament"));
				tournamentData.setnIdFieldType(resultSet.getInt("n_id_field_type"));		
				tournamentData.setNumberofparticipantstournament(resultSet.getInt("numberofparticipantstournament"));
				tournamentData.setnIdInscriptionType(resultSet.getInt("n_id_inscription_type"));
				tournamentData.setcPriceTeam(resultSet.getString("c_price_team"));
				tournamentData.setcInscriptionPaymentAdditionalText(resultSet.getString("c_inscription_payment_additional_text"));
				tournamentData.setcEmailTournament(resultSet.getString("c_email_tournament"));
				tournamentData.setcPhoneTournament(resultSet.getString("c_phone_tournament"));
				tournamentData.setcWebpageTournament(resultSet.getString("c_webpage_tournament"));
				tournamentData.setcPremiostxtTournament(resultSet.getString("c_premiostxt_tournament"));
				tournamentData.setcFechastxtTournament(resultSet.getString("c_fechastxt_tournament"));
				tournamentData.setcAdditionaltxtTournament(resultSet.getString("c_additionaltxt_tournament"));
				tournamentData.setnIdType(resultSet.getInt("n_id_type"));
				
				tournament.put("tournamentData", tournamentData);
				tournament.put("managerName", resultSet.getString("publicname"));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tournament;
	}
}
