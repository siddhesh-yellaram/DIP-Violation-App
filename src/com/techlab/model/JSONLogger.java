package com.techlab.model;

public class JSONLogger implements ILogType{

	@Override
	public void log(String msg) {
		System.out.println("Writing data in JSON file...\n"+msg);
	}
	
}
