package com.aj.microservices.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aj.microservices.service.ForexService;

@RestController
@RequestMapping("/api")
public class APIController {
	
	@Autowired
	ForexService service;
 
	@GetMapping("/currencyfactors/{from}")
	public double getFactorTitle(@PathVariable String from){
		 return service.getFactorByFrom(from);
	}
}
