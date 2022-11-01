package com.aj.idfc.model;


public class Currency {
	
	private long id;
	private String from;
	private double multiplier;
	private double amount;
	private double calAmount;
	
	public Currency() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Currency(long id, String from, double multiplier,double amount,double calAmount) {
		super();
		this.id = id;
		this.from = from;
		this.multiplier = multiplier;
		this.amount = amount;
		this.calAmount = calAmount;
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
	public double getCalAmount() {
		return calAmount;
	}
	public void setCalAmount(double calAmount) {
		this.calAmount = calAmount;
	}
	

}
