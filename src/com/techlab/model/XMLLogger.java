package com.techlab.model;

public class XMLLogger implements ILogType{

	@Override
	public void log(String msg) {
		System.out.println("Writing data in XML file...\n"+msg);
	}
	
}
