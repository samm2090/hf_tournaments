package com.hazfutbol.tournaments.dao;

import com.hazfutbol.tournaments.bean.TournamentPolicyScore;

public interface TournamentPolicyScoreDAO {
	TournamentPolicyScore tournamentScorePolicies(int nIdTournament);

	int saveTournamentPolicyScore(TournamentPolicyScore tournamentPolicyScore);

}
