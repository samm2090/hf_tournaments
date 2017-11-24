package com.hazfutbol.tournaments.bean;

import java.io.Serializable;
import java.util.Date;

public class FieldType implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer fieldTypeId;
	private String fieldTypeName;
	private String fieldTypeNameGroup;
	private Integer status;
	private Integer createdBy;
	private Date createdDate;
	private String createdIp;
	private Integer modBy;
	private Date modDate;
	private String modIp;
	
	public String getFieldTypeNameGroup() {
		return fieldTypeNameGroup;
	}
	public void setFieldTypeNameGroup(String fieldTypeNameGroup) {
		this.fieldTypeNameGroup = fieldTypeNameGroup;
	}
	
	public Integer getFieldTypeId() {
		return fieldTypeId;
	}
	public void setFieldTypeId(Integer fieldTypeId) {
		this.fieldTypeId = fieldTypeId;
	}
	public String getFieldTypeName() {
		return fieldTypeName;
	}
	public void setFieldTypeName(String fieldTypeName) {
		this.fieldTypeName = fieldTypeName;
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
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedIp() {
		return createdIp;
	}
	public void setCreatedIp(String createdIp) {
		this.createdIp = createdIp;
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
	public String getModIp() {
		return modIp;
	}
	public void setModIp(String modIp) {
		this.modIp = modIp;
	}
}
