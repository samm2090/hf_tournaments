package com.hazfutbol.tournaments.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;

import com.hazfutbol.tournaments.bean.Complex;
import com.hazfutbol.tournaments.bean.FieldType;
import com.hazfutbol.tournaments.bean.FootballCategory;
import com.hazfutbol.tournaments.bean.InscriptionType;
import com.hazfutbol.tournaments.bean.TeamPlayer;
import com.hazfutbol.tournaments.dao.ComplexDAO;
import com.hazfutbol.tournaments.dao.FieldTypeDAO;
import com.hazfutbol.tournaments.dao.FootballCategoryDAO;
import com.hazfutbol.tournaments.dao.InscriptionTypeDAO;
import com.hazfutbol.tournaments.dao.TeamPlayerDAO;
import com.hazfutbol.tournaments.dao.TournamentDAO;
import com.hazfutbol.tournaments.dao.imp.ComplexDAOImpl;
import com.hazfutbol.tournaments.dao.imp.FieldTypeDAOImpl;
import com.hazfutbol.tournaments.dao.imp.FootballCategoryDAOImpl;
import com.hazfutbol.tournaments.dao.imp.InscriptionTypeDAOImpl;
import com.hazfutbol.tournaments.dao.imp.TeamPlayerDAOImpl;
import com.hazfutbol.tournaments.dao.imp.TournamentDAOImpl;

@Controller
public class TournamentService {
	TournamentDAO tournamentDAO = new TournamentDAOImpl();
	TeamPlayerDAO teamPlayerDAO = new TeamPlayerDAOImpl();
	FootballCategoryDAO footballCategoryDAO = new FootballCategoryDAOImpl();
	FieldTypeDAO fieldTypeDAO = new FieldTypeDAOImpl();
	InscriptionTypeDAO inscriptionTypeDAO = new InscriptionTypeDAOImpl();
	ComplexDAO complexDAO = new ComplexDAOImpl();
	

	public Map<String, Object> tournamentInformation(int nIdTournament) {
		return tournamentDAO.tournamentInformation(nIdTournament);
	}

	public List<TeamPlayer> listTeamPlayerOptions() {
		return teamPlayerDAO.listTeamPlayerOptions();
	}

	public List<FootballCategory> listFootballCatogories() {
		return footballCategoryDAO.listFootballCatogories();
	}

	public List<FieldType> listFieldTypes() {
		return fieldTypeDAO.listFieldTypes();
	}

	public List<InscriptionType> listInscriptionTypes() {
		return inscriptionTypeDAO.listInscriptionTypes();
	}
	
	public List<Complex> listComplexes() {
		return complexDAO.listComplexes();
	}
}
