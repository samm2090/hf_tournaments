package com.hazfutbol.tournaments.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hazfutbol.tournaments.bean.Tournament;
import com.hazfutbol.tournaments.bean.TournamentPhase;
import com.hazfutbol.tournaments.service.TournamentManagerService;
import com.hazfutbol.tournaments.service.TournamentService;

@Controller
@RequestMapping("setUpTournament")
public class setUpTournamentController {

	TournamentManagerService tournamentManagerService = new TournamentManagerService();
	TournamentService tournamentService = new TournamentService();

	@RequestMapping(value = "/saveTournamentData", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, Object> saveTournamentData(@RequestBody Tournament tournament, HttpServletRequest request) {

		Map<String, Object> message = new HashMap<>();
		tournament.setnIdTournament((int) request.getSession().getAttribute("nIdTournament"));
		int rowsUpdated = tournamentManagerService.saveTournamentData(tournament);
		if (rowsUpdated > 0) {
			message.put("rowsUpdated", rowsUpdated);
			message.put("message", "Se actualizó los datos");
		} else {
			message.put("message", "Error");
		}
		return message;
	}

	@RequestMapping(value = "/saveTournamentPhases", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, Object> saveTournamentPhases(@RequestBody List<TournamentPhase> phases,
			@RequestBody List<Map<String, Object>> tournamentPhases, HttpServletRequest request) {
		Map<String, Object> message = new HashMap<>();

		int rowsUpdated = tournamentManagerService.saveTournamentPhases(tournamentPhases);
		if (rowsUpdated > 0) {
			message.put("rowsUpdated", rowsUpdated);
			message.put("message", "Se actualizó los datos");
		} else {
			message.put("message", "Error");
		}
		return message;
	}

}
