package com.hazfutbol.tournaments.bean;

import java.io.Serializable;
import java.util.Date;

public class TournamentPolicyFault implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer nIdMatchFault;
	private Integer nIdTournament;
	private Integer nCardYellowByMatchForCardRedIndirect;
	private Integer nCardYellowAccumulatedForMatchSuspension;
	private Integer nSuspensionForCardRedDirect;
	private Integer nSuspensionForCardRedIndirect;
	private Date dDateRegisterPolicyMatchFault;
	private Date dDateUpdatePolicyMatchFault;
	
	public Integer getnIdMatchFault() {
		return nIdMatchFault;
	}
	public void setnIdMatchFault(Integer nIdMatchFault) {
		this.nIdMatchFault = nIdMatchFault;
	}
	public Integer getnIdTournament() {
		return nIdTournament;
	}
	public void setnIdTournament(Integer nIdTournament) {
		this.nIdTournament = nIdTournament;
	}
	public Integer getnCardYellowByMatchForCardRedIndirect() {
		return nCardYellowByMatchForCardRedIndirect;
	}
	public void setnCardYellowByMatchForCardRedIndirect(Integer nCardYellowByMatchForCardRedIndirect) {
		this.nCardYellowByMatchForCardRedIndirect = nCardYellowByMatchForCardRedIndirect;
	}
	public Integer getnSuspensionForCardRedDirect() {
		return nSuspensionForCardRedDirect;
	}
	public void setnSuspensionForCardRedDirect(Integer nSuspensionForCardRedDirect) {
		this.nSuspensionForCardRedDirect = nSuspensionForCardRedDirect;
	}
	public Integer getnSuspensionForCardRedIndirect() {
		return nSuspensionForCardRedIndirect;
	}
	public void setnSuspensionForCardRedIndirect(Integer nSuspensionForCardRedIndirect) {
		this.nSuspensionForCardRedIndirect = nSuspensionForCardRedIndirect;
	}
	public Date getdDateRegisterPolicyMatchFault() {
		return dDateRegisterPolicyMatchFault;
	}
	public void setdDateRegisterPolicyMatchFault(Date dDateRegisterPolicyMatchFault) {
		this.dDateRegisterPolicyMatchFault = dDateRegisterPolicyMatchFault;
	}
	public Integer getnCardYellowAccumulatedForMatchSuspension() {
		return nCardYellowAccumulatedForMatchSuspension;
	}
	public void setnCardYellowAccumulatedForMatchSuspension(Integer nCardYellowAccumulatedForMatchSuspension) {
		this.nCardYellowAccumulatedForMatchSuspension = nCardYellowAccumulatedForMatchSuspension;
	}
	public Date getdDateUpdatePolicyMatchFault() {
		return dDateUpdatePolicyMatchFault;
	}
	public void setdDateUpdatePolicyMatchFault(Date dDateUpdatePolicyMatchFault) {
		this.dDateUpdatePolicyMatchFault = dDateUpdatePolicyMatchFault;
	}
}
