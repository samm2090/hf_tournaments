package com.hazfutbol.tournaments.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hazfutbol.tournaments.dao.TournamentDAO;
import com.hazfutbol.tournaments.dao.imp.TournamentDAOImpl;

@Service
public class TournamentManagerService {

	TournamentDAO tournamentDAO = new TournamentDAOImpl();

	public List<Map<String,Object>> listTournamentsByManager(int nIdManagerTournament) {
		return tournamentDAO.listTournamentsByManager(nIdManagerTournament);
	}
}
