package com.hazfutbol.tournaments.bean;

import java.io.Serializable;
import java.util.Date;

public class TournamentPolicyPlaydown implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer nIdPolicyMatchPlaydown;
	private Integer nIdTournament;
	private Integer nIdPolicyMatchPlaydownType;
	private Integer nIndexPolicyMatchPlaydown;
	private Date dDateRegisterPolicyMatchPlaydown;
	private Date dDateUpdatePolicyMatchPlaydown;
	
	public Integer getnIdPolicyMatchPlaydown() {
		return nIdPolicyMatchPlaydown;
	}
	public void setnIdPolicyMatchPlaydown(Integer nIdPolicyMatchPlaydown) {
		this.nIdPolicyMatchPlaydown = nIdPolicyMatchPlaydown;
	}
	public Integer getnIdTournament() {
		return nIdTournament;
	}
	public void setnIdTournament(Integer nIdTournament) {
		this.nIdTournament = nIdTournament;
	}
	public Integer getnIdPolicyMatchPlaydownType() {
		return nIdPolicyMatchPlaydownType;
	}
	public void setnIdPolicyMatchPlaydownType(Integer nIdPolicyMatchPlaydownType) {
		this.nIdPolicyMatchPlaydownType = nIdPolicyMatchPlaydownType;
	}
	public Integer getnIndexPolicyMatchPlaydown() {
		return nIndexPolicyMatchPlaydown;
	}
	public void setnIndexPolicyMatchPlaydown(Integer nIndexPolicyMatchPlaydown) {
		this.nIndexPolicyMatchPlaydown = nIndexPolicyMatchPlaydown;
	}
	public Date getdDateRegisterPolicyMatchPlaydown() {
		return dDateRegisterPolicyMatchPlaydown;
	}
	public void setdDateRegisterPolicyMatchPlaydown(Date dDateRegisterPolicyMatchPlaydown) {
		this.dDateRegisterPolicyMatchPlaydown = dDateRegisterPolicyMatchPlaydown;
	}
	public Date getdDateUpdatePolicyMatchPlaydown() {
		return dDateUpdatePolicyMatchPlaydown;
	}
	public void setdDateUpdatePolicyMatchPlaydown(Date dDateUpdatePolicyMatchPlaydown) {
		this.dDateUpdatePolicyMatchPlaydown = dDateUpdatePolicyMatchPlaydown;
	}

}
