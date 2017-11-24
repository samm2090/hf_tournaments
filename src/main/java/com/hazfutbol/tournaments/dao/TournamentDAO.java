package com.hazfutbol.tournaments.dao;

import java.util.List;
import java.util.Map;

public interface TournamentDAO {
	List<Map<String,Object>> listTournamentsByManager(int nIdManagerTournament);

	Map<String, Object> tournamentInformation(int nIdTournament);
}
