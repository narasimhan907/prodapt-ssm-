package com.synapt.ssm.service.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.synapt.ssm.service.dto.ServiceCategoryDTO;
import com.synapt.ssm.service.service.ServiceCategoryService;

@RestController
@RequestMapping("servicecategories")
public class ServiceCategoryAPI {

  @Autowired
  ServiceCategoryService serviceCategoryService;

  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  @ResponseStatus(HttpStatus.CREATED)
  public ServiceCategoryDTO createServiceCategory(@RequestBody ServiceCategoryDTO serviceCategory) {
    return serviceCategoryService.createServiceCategory(serviceCategory);

  }

}
