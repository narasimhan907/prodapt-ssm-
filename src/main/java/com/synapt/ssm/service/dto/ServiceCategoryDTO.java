package com.synapt.ssm.service.dto;

import java.util.Date;


public class ServiceCategoryDTO {
	private String serviceCategoryId;
	private String name;
	private String description;
	private String status;
	private Date creationTime;
	private Date lastModifiedTime;
	private String createdBy;
	private String lastModifiedBy;
	
		
	public String getServiceCategoryId() {
		return serviceCategoryId;
	}
	public void setServiceCategoryId(String serviceCategoryId) {
		this.serviceCategoryId = serviceCategoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	public Date getLastModifiedTime() {
		return lastModifiedTime;
	}
	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	
	
	
	
	
	

}
