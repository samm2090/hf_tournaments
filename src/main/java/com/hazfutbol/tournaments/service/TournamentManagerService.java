package com.hazfutbol.tournaments.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hazfutbol.tournaments.bean.Tournament;
import com.hazfutbol.tournaments.bean.TournamentPolicyFault;
import com.hazfutbol.tournaments.bean.TournamentPolicyPlaydown;
import com.hazfutbol.tournaments.bean.TournamentPolicyScore;
import com.hazfutbol.tournaments.dao.TournamentDAO;
import com.hazfutbol.tournaments.dao.TournamentPhaseDAO;
import com.hazfutbol.tournaments.dao.TournamentPolicyFaultDAO;
import com.hazfutbol.tournaments.dao.TournamentPolicyPlaydownDAO;
import com.hazfutbol.tournaments.dao.TournamentPolicyScoreDAO;
import com.hazfutbol.tournaments.dao.imp.TournamentDAOImpl;
import com.hazfutbol.tournaments.dao.imp.TournamentPhaseDAOImpl;
import com.hazfutbol.tournaments.dao.imp.TournamentPolicyFaultDAOImpl;
import com.hazfutbol.tournaments.dao.imp.TournamentPolicyPlaydownDAOImpl;
import com.hazfutbol.tournaments.dao.imp.TournamentPolicyScoreDAOImpl;

@Service
public class TournamentManagerService {

	TournamentDAO tournamentDAO = new TournamentDAOImpl();
	TournamentPhaseDAO tournamentPhaseDAO = new TournamentPhaseDAOImpl();
	TournamentPolicyScoreDAO tournamentPolicyScoreDAO = new TournamentPolicyScoreDAOImpl();
	TournamentPolicyFaultDAO tournamentPolicyFaultDAO = new TournamentPolicyFaultDAOImpl();
	TournamentPolicyPlaydownDAO tournamentPolicyPlaydown = new TournamentPolicyPlaydownDAOImpl();

	public List<Map<String, Object>> listTournamentsByManager(int nIdManagerTournament) {
		return tournamentDAO.listTournamentsByManager(nIdManagerTournament);
	}

	public int saveTournamentData(Tournament tournament) {
		return tournamentDAO.saveTournamentData(tournament);
	}

	public int saveTournamentPhases(List<Map<String, Object>> tournamentPhases) {
		return tournamentPhaseDAO.saveTournamentPhases(tournamentPhases);
	}

	public TournamentPolicyScore tournamentScorePolicies(int nIdTournament) {
		return tournamentPolicyScoreDAO.tournamentScorePolicies(nIdTournament);
	}

	public TournamentPolicyFault tournamentFaultPolicies(int nIdTournament) {
		return tournamentPolicyFaultDAO.tournamentFaultPolicies(nIdTournament);
	}

	public List<TournamentPolicyPlaydown> listTournamentPlaydownPolicies(int nIdTournament) {
		return tournamentPolicyPlaydown.listTournamentPlaydownPolicies(nIdTournament);
	}

	public int saveTournamentPolicies(TournamentPolicyFault tournamentPolicyFault,
			TournamentPolicyScore tournamentPolicyScore, Map<String, Object> tournamentPolicyPlaydowns) {

		int rowsUpdated = 0;
		rowsUpdated += tournamentPolicyScoreDAO.saveTournamentPolicyScore(tournamentPolicyScore);
		rowsUpdated += tournamentPolicyFaultDAO.saveTournamentPolicyFault(tournamentPolicyFault);
		rowsUpdated += tournamentPolicyPlaydown.saveTournamentPolicyPlaydown(tournamentPolicyPlaydowns);

		return rowsUpdated;
	}

}
