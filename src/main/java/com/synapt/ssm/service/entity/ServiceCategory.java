package com.synapt.ssm.service.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
@Table(name = "SERVICE_CATEGORY")
public class ServiceCategory {
	@Id
	private String serviceCategoryId;
	
	@Column(name = "name", unique = true)
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "creation_time", updatable=false)
	@CreationTimestamp
	private Date creationTime;
	
	@Column(name= "last_modified_time")
	@UpdateTimestamp
	private Date lastModifiedTime;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "last_modified_by")
	private String lastModifiedBy;

	public String getServiceCategoryId() {
		return serviceCategoryId;
	}

	public ServiceCategory setServiceCategoryId(String serviceCategoryId) {
		this.serviceCategoryId = serviceCategoryId;
		return this;
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
