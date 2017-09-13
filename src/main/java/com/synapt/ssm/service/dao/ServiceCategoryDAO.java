package com.synapt.ssm.service.dao;


import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.synapt.ssm.service.entity.ServiceCategory;

public interface ServiceCategoryDAO extends PagingAndSortingRepository<ServiceCategory, Long>, JpaSpecificationExecutor {

}
