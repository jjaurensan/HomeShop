package com.cursan.homeshop;

public class Fridge extends Product{
	
	private int liter;
	private boolean freezer;
	
	public Fridge(String name, String description, double price, int liter, boolean freezer) {
		super(name, description, price);
		// TODO Auto-generated constructor stub
		this.liter = liter;
		this.freezer=freezer;
	}

	public boolean isFreezer() {
		return freezer;
	}

	public int getLiter() {
		return liter;
	}


}


