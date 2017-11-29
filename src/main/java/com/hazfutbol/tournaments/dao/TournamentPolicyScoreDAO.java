package com.hazfutbol.tournaments.dao;

import java.util.List;

import com.hazfutbol.tournaments.bean.TournamentPolicyScore;

public interface TournamentPolicyScoreDAO {
	List<TournamentPolicyScore> listTournamentScorePolicies(int nIdTournament);
}
