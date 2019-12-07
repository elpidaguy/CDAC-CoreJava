package com.app.core;

public enum CustomerType {
		
		SILVER,GOLD,PLATINUM;
		
		@Override
		public String toString()
		{
			return name().toLowerCase();
		}

	}