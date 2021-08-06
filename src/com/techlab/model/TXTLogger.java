package com.techlab.model;

public class TXTLogger implements ILogType{

	@Override
	public void log(String msg) {
		System.out.println("Writing data in TXT file...\n"+msg);
	}
	
}
