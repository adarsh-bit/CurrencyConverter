package com.aj.microservices.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aj.microservices.model.CurrencyFactor;
import com.aj.microservices.service.ForexService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	ForexService forexservice;
	
	@GetMapping("/currencyfactors")
	public List<CurrencyFactor>getAllFcators(){
		 return  forexservice.getAllFactors();
	}
	
	@GetMapping("/currencyfactors/{id}")
	public CurrencyFactor getCurrencyFactorById(@PathVariable long id){
		 return  forexservice.findCurrencyFactorById(id);
	}

	@PostMapping("/currencyfactors")
	public CurrencyFactor addCurrencyFactor(@RequestBody CurrencyFactor factor) {
		
		return forexservice.addCurrencyFactor(factor);
	}
	
	@PutMapping("/currencyfactors/{id}")
	public CurrencyFactor updateCurrencyFactor(@RequestBody CurrencyFactor factor,@PathVariable long id) {
		
		return forexservice.updateCurrencyFactor(factor,id);
	}
	
	
	@DeleteMapping("/currencyfactors/{id}")
	public void deleteCurrencyFactorById(@PathVariable long id) {
		
		 forexservice.deleteCurrency(id);
	
	}

}
