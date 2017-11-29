package com.hazfutbol.tournaments.bean;

import java.io.Serializable;
import java.util.Date;

public class TournamentPolicyScore implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer nIdPolicyMatchScore;
	private Integer nIdTournament;
	private Integer nWinWithoutSupplementaryTime;
	private Integer nWinWithSupplementaryTime;
	private Integer nWinWithPenaltyGoals;
	private Integer nWinWithTossUp;
	private Integer nWinWithWalkover;
	private Integer nWinWithWalkoverGoalAdded;
	private Integer nGoalsDraw;
	private Integer nLoseWithoutSupplementaryTime;
	private Integer nLoseWithSupplementaryTime;
	private Integer nLoseWithPenaltyGoals;
	private Integer nLoseWithTossUp;
	private Integer nLoseWithWalkover;
	private Integer nLoseWithWalkoverGoalAdded;
	private String cConsiderSupplementaryTimeGoal;
	private String cConsiderPenaltyGoal;
	private Date dDateRegisterPolicyMatchScore;
	private Date dDateUpdatePolicyMatchScore;
	
	public Integer getnIdPolicyMatchScore() {
		return nIdPolicyMatchScore;
	}
	public void setnIdPolicyMatchScore(Integer nIdPolicyMatchScore) {
		this.nIdPolicyMatchScore = nIdPolicyMatchScore;
	}
	public Integer getnIdTournament() {
		return nIdTournament;
	}
	public void setnIdTournament(Integer nIdTournament) {
		this.nIdTournament = nIdTournament;
	}
	public Integer getnWinWithoutSupplementaryTime() {
		return nWinWithoutSupplementaryTime;
	}
	public void setnWinWithoutSupplementaryTime(Integer nWinWithoutSupplementaryTime) {
		this.nWinWithoutSupplementaryTime = nWinWithoutSupplementaryTime;
	}
	public Integer getnWinWithSupplementaryTime() {
		return nWinWithSupplementaryTime;
	}
	public void setnWinWithSupplementaryTime(Integer nWinWithSupplementaryTime) {
		this.nWinWithSupplementaryTime = nWinWithSupplementaryTime;
	}
	public Integer getnWinWithPenaltyGoals() {
		return nWinWithPenaltyGoals;
	}
	public void setnWinWithPenaltyGoals(Integer nWinWithPenaltyGoals) {
		this.nWinWithPenaltyGoals = nWinWithPenaltyGoals;
	}
	public Integer getnWinWithTossUp() {
		return nWinWithTossUp;
	}
	public void setnWinWithTossUp(Integer nWinWithTossUp) {
		this.nWinWithTossUp = nWinWithTossUp;
	}
	public Integer getnWinWithWalkover() {
		return nWinWithWalkover;
	}
	public void setnWinWithWalkover(Integer nWinWithWalkover) {
		this.nWinWithWalkover = nWinWithWalkover;
	}
	public Integer getnGoalsDraw() {
		return nGoalsDraw;
	}
	public void setnGoalsDraw(Integer nGoalsDraw) {
		this.nGoalsDraw = nGoalsDraw;
	}
	public Integer getnLoseWithoutSupplementaryTime() {
		return nLoseWithoutSupplementaryTime;
	}
	public void setnLoseWithoutSupplementaryTime(Integer nLoseWithoutSupplementaryTime) {
		this.nLoseWithoutSupplementaryTime = nLoseWithoutSupplementaryTime;
	}
	public Integer getnLoseWithSupplementaryTime() {
		return nLoseWithSupplementaryTime;
	}
	public void setnLoseWithSupplementaryTime(Integer nLoseWithSupplementaryTime) {
		this.nLoseWithSupplementaryTime = nLoseWithSupplementaryTime;
	}
	public Integer getnLoseWithPenaltyGoals() {
		return nLoseWithPenaltyGoals;
	}
	public void setnLoseWithPenaltyGoals(Integer nLoseWithPenaltyGoals) {
		this.nLoseWithPenaltyGoals = nLoseWithPenaltyGoals;
	}
	public Integer getnLoseWithTossUp() {
		return nLoseWithTossUp;
	}
	public void setnLoseWithTossUp(Integer nLoseWithTossUp) {
		this.nLoseWithTossUp = nLoseWithTossUp;
	}
	public Integer getnLoseWithWalkover() {
		return nLoseWithWalkover;
	}
	public void setnLoseWithWalkover(Integer nLoseWithWalkover) {
		this.nLoseWithWalkover = nLoseWithWalkover;
	}
	public String getcConsiderSupplementaryTimeGoal() {
		return cConsiderSupplementaryTimeGoal;
	}
	public void setcConsiderSupplementaryTimeGoal(String cConsiderSupplementaryTimeGoal) {
		this.cConsiderSupplementaryTimeGoal = cConsiderSupplementaryTimeGoal;
	}
	public String getcConsiderPenaltyGoal() {
		return cConsiderPenaltyGoal;
	}
	public void setcConsiderPenaltyGoal(String cConsiderPenaltyGoal) {
		this.cConsiderPenaltyGoal = cConsiderPenaltyGoal;
	}
	public Date getdDateRegisterPolicyMatchScore() {
		return dDateRegisterPolicyMatchScore;
	}
	public void setdDateRegisterPolicyMatchScore(Date dDateRegisterPolicyMatchScore) {
		this.dDateRegisterPolicyMatchScore = dDateRegisterPolicyMatchScore;
	}
	public Date getdDateUpdatePolicyMatchScore() {
		return dDateUpdatePolicyMatchScore;
	}
	public void setdDateUpdatePolicyMatchScore(Date dDateUpdatePolicyMatchScore) {
		this.dDateUpdatePolicyMatchScore = dDateUpdatePolicyMatchScore;
	}
	public Integer getnWinWithWalkoverGoalAdded() {
		return nWinWithWalkoverGoalAdded;
	}
	public void setnWinWithWalkoverGoalAdded(Integer nWinWithWalkoverGoalAdded) {
		this.nWinWithWalkoverGoalAdded = nWinWithWalkoverGoalAdded;
	}
	public Integer getnLoseWithWalkoverGoalAdded() {
		return nLoseWithWalkoverGoalAdded;
	}
	public void setnLoseWithWalkoverGoalAdded(Integer nLoseWithWalkoverGoalAdded) {
		this.nLoseWithWalkoverGoalAdded = nLoseWithWalkoverGoalAdded;
	}
	
}
