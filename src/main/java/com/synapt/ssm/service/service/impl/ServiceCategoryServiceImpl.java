package com.synapt.ssm.service.service.impl;

import static com.synapt.ssm.service.constants.ServiceCategoryConstants.ACTIVE;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synapt.ssm.service.dao.ServiceCategoryDAO;
import com.synapt.ssm.service.dto.ServiceCategoryDTO;
import com.synapt.ssm.service.entity.ServiceCategory;
import com.synapt.ssm.service.mapper.ServiceCategoryMapper;
import com.synapt.ssm.service.service.ServiceCategoryService;

@Service
public class ServiceCategoryServiceImpl implements ServiceCategoryService {

  @Autowired
  ServiceCategoryDAO serviceCategoryRepository;

  @Override
  public ServiceCategoryDTO createServiceCategory(ServiceCategoryDTO serviceCategoryDTO) {
    ServiceCategory serviceCategory = ServiceCategoryMapper.MAPPER.toServiceCategory(serviceCategoryDTO);
    serviceCategory.setCreatedBy("");
    serviceCategory.setStatus(ACTIVE);
    serviceCategory.setServiceCategoryId(UUID.randomUUID().toString());;
    serviceCategory = serviceCategoryRepository.save(serviceCategory);
    return ServiceCategoryMapper.MAPPER.fromServiceCategory(serviceCategory);

  }

}
