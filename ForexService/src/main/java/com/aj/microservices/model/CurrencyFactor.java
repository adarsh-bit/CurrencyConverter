package com.aj.microservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="currencyfactor")
public class CurrencyFactor {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="conversion_to")
	private String from;
	
	@Column(name="exchange_rate")
	private double multiplier;
	
	
	public CurrencyFactor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrencyFactor(long id, String from, double multiplier) {
		super();
		this.id = id;
		this.from = from;
		this.multiplier = multiplier;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public double getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
	}
	
}
	
	
	