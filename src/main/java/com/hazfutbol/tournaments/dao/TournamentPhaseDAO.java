package com.hazfutbol.tournaments.dao;

import java.util.List;
import java.util.Map;

public interface TournamentPhaseDAO {

	List<Map<String, Object>> listPhasesByTornament(int nIdTournament);
	
	int saveTournamentPhases(List<Map<String, Object>> tournamentPhases); 
}
