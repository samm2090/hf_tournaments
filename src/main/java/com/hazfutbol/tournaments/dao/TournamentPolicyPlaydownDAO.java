package com.hazfutbol.tournaments.dao;

import java.util.List;
import java.util.Map;

import com.hazfutbol.tournaments.bean.TournamentPolicyPlaydown;

public interface TournamentPolicyPlaydownDAO {
	List<TournamentPolicyPlaydown> listTournamentPlaydownPolicies(int nIdTournament);

	int saveTournamentPolicyPlaydown(Map<String, Object> tournamentPolicyPlaydowns);
}
