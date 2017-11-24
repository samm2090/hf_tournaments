package com.hazfutbol.tournaments.bean;

import java.io.Serializable;
import java.util.Date;

public class TeamPlayer implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer teamPlayerId;
	private Integer quantity;
	private String name;
	private Integer status;
	private Integer createdBy;
	private Date createDate;
	private String CreatedIp;
	private Integer modBy;
	private Date modDate;
	private String modIP;
	
	public Integer getTeamPlayerId() {
		return teamPlayerId;
	}
	public void setTeamPlayerId(Integer teamPlayerId) {
		this.teamPlayerId = teamPlayerId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCreatedIp() {
		return CreatedIp;
	}
	public void setCreatedIp(String createdIp) {
		CreatedIp = createdIp;
	}
	public Integer getModBy() {
		return modBy;
	}
	public void setModBy(Integer modBy) {
		this.modBy = modBy;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}
	public String getModIP() {
		return modIP;
	}
	public void setModIP(String modIP) {
		this.modIP = modIP;
	}
}
