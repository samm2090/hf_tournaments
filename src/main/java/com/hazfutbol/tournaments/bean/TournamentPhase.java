package com.hazfutbol.tournaments.bean;

import java.io.Serializable;
import java.util.Date;

public class TournamentPhase implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer nIdPhaseTournament;
	private Integer nIdStage;
	private String cNamePhaseTournament;
	private Integer nIndexPhaseTournament;
	private Integer nIndexPhaseByTournament;
	private Integer nQuantityGroupsPhase;
	private Integer nQuantityTeamsByGroupPhase;
	private Integer nQuantityDatesPhase;
	private Integer nQuantityWinnersPhase;
	private Integer nQuantitySimultmatchesPhase;
	private Integer nIdReferenceRelateTeamMatch;
	private String cIsClosedPhase;
	private String cStatusPhaseTournament;
	private Date dDateRegisterPhaseTournament;
	private Date dDateUpdatePhaseTournament;
	private Integer nQuantityTeams;
	private String cDescriptionPhase;
	
	public Integer getnIdPhaseTournament() {
		return nIdPhaseTournament;
	}
	public void setnIdPhaseTournament(Integer nIdPhaseTournament) {
		this.nIdPhaseTournament = nIdPhaseTournament;
	}
	public Integer getnIdStage() {
		return nIdStage;
	}
	public void setnIdStage(Integer nIdStage) {
		this.nIdStage = nIdStage;
	}
	public String getcNamePhaseTournament() {
		return cNamePhaseTournament;
	}
	public void setcNamePhaseTournament(String cNamePhaseTournament) {
		this.cNamePhaseTournament = cNamePhaseTournament;
	}
	public Integer getnIndexPhaseTournament() {
		return nIndexPhaseTournament;
	}
	public void setnIndexPhaseTournament(Integer nIndexPhaseTournament) {
		this.nIndexPhaseTournament = nIndexPhaseTournament;
	}
	public Integer getnIndexPhaseByTournament() {
		return nIndexPhaseByTournament;
	}
	public void setnIndexPhaseByTournament(Integer nIndexPhaseByTournament) {
		this.nIndexPhaseByTournament = nIndexPhaseByTournament;
	}
	public Integer getnQuantityGroupsPhase() {
		return nQuantityGroupsPhase;
	}
	public void setnQuantityGroupsPhase(Integer nQuantityGroupsPhase) {
		this.nQuantityGroupsPhase = nQuantityGroupsPhase;
	}
	public Integer getnQuantityTeamsByGroupPhase() {
		return nQuantityTeamsByGroupPhase;
	}
	public void setnQuantityTeamsByGroupPhase(Integer nQuantityTeamsByGroupPhase) {
		this.nQuantityTeamsByGroupPhase = nQuantityTeamsByGroupPhase;
	}
	public Integer getnQuantityDatesPhase() {
		return nQuantityDatesPhase;
	}
	public void setnQuantityDatesPhase(Integer nQuantityDatesPhase) {
		this.nQuantityDatesPhase = nQuantityDatesPhase;
	}
	public Integer getnQuantityWinnersPhase() {
		return nQuantityWinnersPhase;
	}
	public void setnQuantityWinnersPhase(Integer nQuantityWinnersPhase) {
		this.nQuantityWinnersPhase = nQuantityWinnersPhase;
	}
	public Integer getnQuantitySimultmatchesPhase() {
		return nQuantitySimultmatchesPhase;
	}
	public void setnQuantitySimultmatchesPhase(Integer nQuantitySimultmatchesPhase) {
		this.nQuantitySimultmatchesPhase = nQuantitySimultmatchesPhase;
	}
	public Integer getnIdReferenceRelateTeamMatch() {
		return nIdReferenceRelateTeamMatch;
	}
	public void setnIdReferenceRelateTeamMatch(Integer nIdReferenceRelateTeamMatch) {
		this.nIdReferenceRelateTeamMatch = nIdReferenceRelateTeamMatch;
	}
	public String getcIsClosedPhase() {
		return cIsClosedPhase;
	}
	public void setcIsClosedPhase(String cIsClosedPhase) {
		this.cIsClosedPhase = cIsClosedPhase;
	}
	public String getcStatusPhaseTournament() {
		return cStatusPhaseTournament;
	}
	public void setcStatusPhaseTournament(String cStatusPhaseTournament) {
		this.cStatusPhaseTournament = cStatusPhaseTournament;
	}
	public Date getdDateRegisterPhaseTournament() {
		return dDateRegisterPhaseTournament;
	}
	public void setdDateRegisterPhaseTournament(Date dDateRegisterPhaseTournament) {
		this.dDateRegisterPhaseTournament = dDateRegisterPhaseTournament;
	}
	public Date getdDateUpdatePhaseTournament() {
		return dDateUpdatePhaseTournament;
	}
	public void setdDateUpdatePhaseTournament(Date dDateUpdatePhaseTournament) {
		this.dDateUpdatePhaseTournament = dDateUpdatePhaseTournament;
	}
	public Integer getnQuantityTeams() {
		return nQuantityTeams;
	}
	public void setnQuantityTeams(Integer nQuantityTeams) {
		this.nQuantityTeams = nQuantityTeams;
	}
	public String getcDescriptionPhase() {
		return cDescriptionPhase;
	}
	public void setcDescriptionPhase(String cDescriptionPhase) {
		this.cDescriptionPhase = cDescriptionPhase;
	}
	

}
