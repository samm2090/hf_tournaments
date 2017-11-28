package com.hazfutbol.tournaments.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hazfutbol.tournaments.bean.City;
import com.hazfutbol.tournaments.bean.Complex;
import com.hazfutbol.tournaments.bean.FieldType;
import com.hazfutbol.tournaments.bean.FootballCategory;
import com.hazfutbol.tournaments.bean.InscriptionType;
import com.hazfutbol.tournaments.bean.TeamPlayer;
import com.hazfutbol.tournaments.service.TournamentManagerService;
import com.hazfutbol.tournaments.service.TournamentService;

@Controller																																				
public class tournamentController {

	TournamentManagerService tournamentManagerService = new TournamentManagerService();
	TournamentService tournamentService = new TournamentService();

	@RequestMapping(value = "/tournamentManager", method = RequestMethod.GET)
	public ModelAndView tournamentManagerMain() {
		ModelAndView modelAndView = new ModelAndView();
		List<Map<String, Object>> tournaments = tournamentManagerService.listTournamentsByManager(1);
		modelAndView.setViewName("tournamentManagerMain");
		modelAndView.addObject("tournaments", tournaments);
		return modelAndView;
	}

	@RequestMapping(value = "/setUpTournament", method = RequestMethod.POST)
	public ModelAndView setUpTournament(@RequestParam(value = "nIdTournament") int nIdTournament,
			HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		request.getSession().setAttribute("nIdTournament", nIdTournament);
		
		Map<String, Object> tournament = tournamentService.tournamentInformation(nIdTournament);
		List<TeamPlayer> teamPlayerOptions = tournamentService.listTeamPlayerOptions();
		List<FootballCategory> footballCategories = tournamentService.listFootballCatogories();
		List<FieldType> fieldTypes = tournamentService.listFieldTypes();
		List<InscriptionType> inscriptionTypes = tournamentService.listInscriptionTypes();
		List<Complex> complexes = tournamentService.listComplexes();
		List<City> cities = tournamentService.listCities();
		
		modelAndView.setViewName("tournamentSetUp");
		modelAndView.addObject("tournament", tournament);
		modelAndView.addObject("teamPlayerOptions", teamPlayerOptions);
		modelAndView.addObject("footballCategories", footballCategories);
		modelAndView.addObject("fieldTypes", fieldTypes);
		modelAndView.addObject("inscriptionTypes", inscriptionTypes);
		modelAndView.addObject("complexes", complexes);
		modelAndView.addObject("cities", cities);
		
		return modelAndView;
	}

	@RequestMapping(value = "/fillTournament", method = RequestMethod.POST)
	public ModelAndView fillTournament(@RequestBody Map<String, Object> params, HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("tournamentFillUp");
		return modelAndView;
	}

	@RequestMapping(value = "/tournamentData", method = RequestMethod.GET)
	public ModelAndView tournamentData() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("tournamentSetUp");
		return modelAndView;
	}

	@RequestMapping(value = "/tournamentMultimedia", method = RequestMethod.GET)
	public ModelAndView tournamentMultimedia() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("tournamentMultimedia");
		return modelAndView;
	}

	@RequestMapping(value = "/tournamentStructure", method = RequestMethod.GET)
	public ModelAndView tournamentStructure(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		int nIdTournament =(int) request.getSession().getAttribute("nIdTournament");
		List<Map<String, Object>> tournamentPhases = tournamentService.listPhasesByTornament(nIdTournament);
		
		modelAndView.setViewName("tournamentStructure");
		modelAndView.addObject("tournamentPhases", tournamentPhases);
		return modelAndView;
	}

	@RequestMapping(value = "/tournamentBasicParameters", method = RequestMethod.GET)
	public ModelAndView tournamentBasicParameters() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("tournamentBasicParameters");
		return modelAndView;
	}

	@RequestMapping(value = "/tournamentGroups", method = RequestMethod.GET)
	public ModelAndView tournamentGroups() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("tournamentGroups");
		return modelAndView;
	}

	@RequestMapping(value = "/tournamentSchedule", method = RequestMethod.GET)
	public ModelAndView tournamentSchedule() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("tournamentSchedule");
		return modelAndView;
	}

	@RequestMapping(value = "/tournamentResults", method = RequestMethod.GET)
	public ModelAndView tournamentResults() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("tournamentResults");
		return modelAndView;
	}

	@RequestMapping(value = "/tournamentQualifiers", method = RequestMethod.GET)
	public ModelAndView tournamentQualifiers() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("tournamentQualifiers");
		return modelAndView;
	}
}
