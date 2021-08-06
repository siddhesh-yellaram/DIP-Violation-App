package com.techlab.test;

import com.techlab.model.TaxCalculator;
import com.techlab.model.XMLLogger;

public class DIPTest {
	public static void main(String []args) {
		TaxCalculator tx = new TaxCalculator(new XMLLogger());
		System.out.println(tx.calculateTax(5000, 20));
		System.out.println(tx.calculateTax(2, 0));
	}
}
