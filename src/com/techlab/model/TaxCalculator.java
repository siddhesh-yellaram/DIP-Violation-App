package com.techlab.model;

public class TaxCalculator {
	ILogType log;
	
	public TaxCalculator(ILogType log) {
		this.log = log;
	}
	
	public int calculateTax(int amount, int rate) {
		try {
			int result = amount / rate;
			return result;
		}catch(Exception e) {
			log.log("Don't divide by zero");
			return -1;
		}
	}
}
