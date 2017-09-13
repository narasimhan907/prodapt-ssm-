package com.synapt.ssm.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@EnableDiscoveryClient
@SpringBootApplication
public class SSMServiceMgmtApplication {
	/*@Autowired
	DiscoveryClient discoveryClient;
	
	@RequestMapping(value = "/")
	public List<ServiceInstance> serviceInstancesByApplicationName(@PathVariable String applicationName) {
		return this.discoveryClient.getInstances(applicationName);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(SSMServiceMgmtApplication.class, args);
	}
	
	/*@Bean
	public  ServiceService serviceService() {
		return new ServiceServiceImpl();
	}
	
	@Bean
	public ServiceCategoryService serviceCategoryService() {
		return new ServiceCategoryServiceImpl();
	}*/
}
