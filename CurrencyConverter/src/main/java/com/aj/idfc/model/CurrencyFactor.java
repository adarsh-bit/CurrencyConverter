package com.aj.idfc.model;


public class CurrencyFactor {
   
	
	private long id;
	private String from;
	private double multiplier;
	private double amount;
	private double calamount;
	
	public CurrencyFactor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrencyFactor(long id, String from, double multiplier,double amount,double calamount) {
		super();
		this.id = id;
		this.from = from;
		this.multiplier = multiplier;
		this.amount = amount;
		this.calamount = calamount;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getCalamount() {
		return calamount;
	}
	public void setCalamount(double calamount) {
		this.calamount = calamount;
	}
	
}
	
	
	