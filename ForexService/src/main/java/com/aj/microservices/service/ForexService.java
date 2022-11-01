package com.aj.microservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aj.microservices.dao.ForexServiceRepository;
import com.aj.microservices.model.CurrencyFactor;

@Service
public class ForexService {
	
	@Autowired
	ForexServiceRepository forexrepo;

	public double getFactorByFrom(String from) {
		// TODO Auto-generated method stub
		CurrencyFactor factor = forexrepo.findByFrom(from);
		 return factor.getMultiplier();
	}

	public CurrencyFactor findCurrencyFactorById(long id) {
		// TODO Auto-generated method stub
		return forexrepo.findById(id).get();
	}
	
	public CurrencyFactor addCurrencyFactor(CurrencyFactor factor) {
		// TODO Auto-generated method stub
		return forexrepo.save(factor);
	}

	public CurrencyFactor updateCurrencyFactor(CurrencyFactor factor, long id) {
		// TODO Auto-generated method stub
		CurrencyFactor toUpdate = forexrepo.findById(id).get();
		toUpdate.setFrom(factor.getFrom());
		toUpdate.setMultiplier(factor.getMultiplier());
		
		return forexrepo.save(toUpdate);
	}

	public void deleteCurrency(long id) {
		 forexrepo.deleteById(id);
		
	}
	public List<CurrencyFactor> getAllFactors() {
		// TODO Auto-generated method stub
		return forexrepo.findAll();
	}

}
