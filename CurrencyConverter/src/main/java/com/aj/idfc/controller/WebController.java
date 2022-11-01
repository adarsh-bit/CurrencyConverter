package com.aj.idfc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
public class WebController {
	
	
	public Double convert(String from) {
		
		Map<String,String>map = new HashMap<>();
		map.put("from",from);
		ResponseEntity<Double> responseEntity=new RestTemplate().getForEntity("http://localhost:9002/api/currencyfactors/{from}", Double.class,map);
		return responseEntity.getBody();
	}
	  
	@GetMapping("/currencyconverter/")
	  public double convertCurrency(
				@RequestParam double amount, 
				@RequestParam String from, 
				@RequestParam String to
				) {
			double exchangeRateFromCurr = this.convert(from);
			
			double fromCurrToInr = amount * exchangeRateFromCurr;
			
			double exchangeRateToCurr = this.convert(to);
		
		
			return (fromCurrToInr/exchangeRateToCurr);

	}


}
