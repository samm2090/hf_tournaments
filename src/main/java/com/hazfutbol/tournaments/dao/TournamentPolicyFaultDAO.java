package com.hazfutbol.tournaments.dao;

import com.hazfutbol.tournaments.bean.TournamentPolicyFault;

public interface TournamentPolicyFaultDAO {
	TournamentPolicyFault tournamentFaultPolicies(int nIdTournament);

	int saveTournamentPolicyFault(TournamentPolicyFault tournamentPolicyFault);
}
