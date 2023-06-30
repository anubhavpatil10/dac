package com.app.patient;

public enum RoomType {
	PRIVATE(1000), GENERAL(500), ICU(1500), SPECIAL(2000) ;
	
	private double cost;

	private RoomType(double cost) {
		this.cost = cost;
	}
}
