package com.synapt.ssm.service.dto;

import java.util.List;

import com.synapt.ssm.service.entity.DeviceType;
import com.synapt.ssm.service.entity.Service;
import com.synapt.ssm.service.entity.ServiceCategory;

public class ServiceDTO {
	private String servieId;
	private String name;
	private String description;
	private String status;
	private String serviceType;
	private ServiceCategory serviceCategory;
	private List<DeviceType> deviceType;
	private String creationTime;
	private String lastModifiedTime;
	private String createdBy;
	private String lastModifiedBy;
	
	public ServiceDTO(Service service, String createdBy) {
		
	}
	
	public String getServieId() {
		return servieId;
	}
	public void setServieId(String servieId) {
		this.servieId = servieId;
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
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public ServiceCategory getServiceCategory() {
		return serviceCategory;
	}
	public void setServiceCategory(ServiceCategory serviceCategory) {
		this.serviceCategory = serviceCategory;
	}
	public List<DeviceType> getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(List<DeviceType> deviceType) {
		this.deviceType = deviceType;
	}
	public String getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
	public String getLastModifiedTime() {
		return lastModifiedTime;
	}
	public void setLastModifiedTime(String lastModifiedTime) {
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
