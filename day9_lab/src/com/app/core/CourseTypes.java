package com.app.core;

public enum CourseTypes {
	
	DAC,DBDA,DAI,DMC,DITISS;
	
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}

}
