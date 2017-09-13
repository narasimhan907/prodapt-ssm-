package com.synapt.ssm.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.synapt.ssm.service.dto.ServiceCategoryDTO;
import com.synapt.ssm.service.entity.ServiceCategory;

@Mapper
public interface ServiceCategoryMapper {

  ServiceCategoryMapper MAPPER = Mappers.getMapper(ServiceCategoryMapper.class);

  @Mappings(@Mapping(source = "name", target = "name"))
  ServiceCategory toServiceCategory(ServiceCategoryDTO serviceCategory);

  @InheritInverseConfiguration
  ServiceCategoryDTO fromServiceCategory(ServiceCategory serviceCategory);

}
