package com.hazfutbol.tournaments.dao;

import java.util.List;

import com.hazfutbol.tournaments.bean.TournamentPolicyPlaydown;

public interface TournamentPolicyPlaydownDAO {
	List<TournamentPolicyPlaydown> listTournamentPlaydownPolicies(int nIdTournament);
}
