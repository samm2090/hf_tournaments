package com.hazfutbol.tournaments.dao;

import java.util.List;
import java.util.Map;

import com.hazfutbol.tournaments.bean.Tournament;

public interface TournamentDAO {
	List<Map<String,Object>> listTournamentsByManager(int nIdManagerTournament);

	Map<String, Object> tournamentInformation(int nIdTournament);

	int saveTournamentData(Tournament tournament);
}
