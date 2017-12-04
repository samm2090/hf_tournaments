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

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.hazfutbol.tournaments.bean.Tournament;
import com.hazfutbol.tournaments.bean.TournamentPolicyFault;
import com.hazfutbol.tournaments.bean.TournamentPolicyScore;
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
	public Map<String, Object> saveTournamentPhases(@RequestBody Map<String, Object> data,
			HttpServletRequest request) {
		Map<String, Object> message = new HashMap<>();
		
		@SuppressWarnings("unchecked")
		List<Map<String,Object>> tournamentPhases = (List<Map<String, Object>>) data.get("tournamentPhases");
		int rowsUpdated = tournamentManagerService.saveTournamentPhases(tournamentPhases);
		if (rowsUpdated > 0) {
			message.put("rowsUpdated", rowsUpdated);
			message.put("message", "Se actualizó los datos");
		} else {
			message.put("message", "Error");
		}
		return message;
	}
	
	@RequestMapping(value = "/saveTournamentPolicies", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, Object> saveTournamentPolicies(@RequestBody Map<String, Object> data,
			HttpServletRequest request) {
		Map<String, Object> message = new HashMap<>();
		
		Gson gson = new Gson();
		JsonElement jsonElement = gson.toJsonTree(data.get("tournamentPolicyFault"));
		TournamentPolicyFault tournamentPolicyFault = gson.fromJson(jsonElement, TournamentPolicyFault.class);
		
		jsonElement = gson.toJsonTree(data.get("tournamentPolicyScore"));
		TournamentPolicyScore tournamentPolicyScore = gson.fromJson(jsonElement, TournamentPolicyScore.class);
		
		@SuppressWarnings("unchecked")
		Map<String, Object> tournamentPolicyPlaydowns = (Map<String, Object>) data.get("playdownPolicy");
		
		int rowsUpdated = tournamentManagerService.saveTournamentPolicies(tournamentPolicyFault,tournamentPolicyScore,tournamentPolicyPlaydowns);
		if (rowsUpdated > 0) {
			message.put("rowsUpdated", rowsUpdated);
			message.put("message", "Se actualizó los datos");
		} else {
			message.put("message", "Error");
		}
		return message;
	}

}
