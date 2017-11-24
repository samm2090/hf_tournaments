package com.hazfutbol.tournaments.bean;

import java.io.Serializable;
import java.util.Date;

public class InscriptionType implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer nIdInscriptionType;
	private String cNameInscriptionType;
	private String cDescriptionInscriptionType;
	private String cStatusInscriptionType;
	private Date dDateRegisterInscriptionType;
	private Date dDateUpdateInscriptionType;
	public Integer getnIdInscriptionType() {
		return nIdInscriptionType;
	}
	public void setnIdInscriptionType(Integer nIdInscriptionType) {
		this.nIdInscriptionType = nIdInscriptionType;
	}
	public String getcNameInscriptionType() {
		return cNameInscriptionType;
	}
	public void setcNameInscriptionType(String cNameInscriptionType) {
		this.cNameInscriptionType = cNameInscriptionType;
	}
	public String getcDescriptionInscriptionType() {
		return cDescriptionInscriptionType;
	}
	public void setcDescriptionInscriptionType(String cDescriptionInscriptionType) {
		this.cDescriptionInscriptionType = cDescriptionInscriptionType;
	}
	public String getcStatusInscriptionType() {
		return cStatusInscriptionType;
	}
	public void setcStatusInscriptionType(String cStatusInscriptionType) {
		this.cStatusInscriptionType = cStatusInscriptionType;
	}
	public Date getdDateRegisterInscriptionType() {
		return dDateRegisterInscriptionType;
	}
	public void setdDateRegisterInscriptionType(Date dDateRegisterInscriptionType) {
		this.dDateRegisterInscriptionType = dDateRegisterInscriptionType;
	}
	public Date getdDateUpdateInscriptionType() {
		return dDateUpdateInscriptionType;
	}
	public void setdDateUpdateInscriptionType(Date dDateUpdateInscriptionType) {
		this.dDateUpdateInscriptionType = dDateUpdateInscriptionType;
	}
	
}
