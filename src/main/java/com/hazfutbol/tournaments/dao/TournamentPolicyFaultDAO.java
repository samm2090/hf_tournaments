package com.hazfutbol.tournaments.dao;

import java.util.List;

import com.hazfutbol.tournaments.bean.TournamentPolicyFault;

public interface TournamentPolicyFaultDAO {
	List<TournamentPolicyFault> listTournamentFaultPolicies(int nIdTournament);
}
