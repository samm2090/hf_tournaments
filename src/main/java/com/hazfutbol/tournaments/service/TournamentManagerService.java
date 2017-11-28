package com.hazfutbol.tournaments.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hazfutbol.tournaments.bean.Tournament;
import com.hazfutbol.tournaments.dao.TournamentDAO;
import com.hazfutbol.tournaments.dao.TournamentPhaseDAO;
import com.hazfutbol.tournaments.dao.imp.TournamentDAOImpl;
import com.hazfutbol.tournaments.dao.imp.TournamentPhaseDAOImpl;

@Service
public class TournamentManagerService {

	TournamentDAO tournamentDAO = new TournamentDAOImpl();
	TournamentPhaseDAO tournamentPhaseDAO = new TournamentPhaseDAOImpl();

	public List<Map<String, Object>> listTournamentsByManager(int nIdManagerTournament) {
		return tournamentDAO.listTournamentsByManager(nIdManagerTournament);
	}

	public int saveTournamentData(Tournament tournament) {
		return tournamentDAO.saveTournamentData(tournament);
	}

	public int saveTournamentPhases(List<Map<String, Object>> tournamentPhases) {
		return tournamentPhaseDAO.saveTournamentPhases(tournamentPhases);
	}

}
