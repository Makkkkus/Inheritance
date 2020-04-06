package com.main;

import java.util.HashMap;

import com.main.entities.Human;

public class Town {
	public HashMap<Integer, Human> residents = new HashMap<>();;
	public Human leader;
	public String name;
	
	public Town(String name) {
		this.name = name;
	}
	
	private boolean freeCity;
	public void addHuman(Human h) {
		residents.put(residents.size()+1, h);
	}

	public boolean isFreeCity() {
		return freeCity;
	}

	public void setFreeCity(boolean freeCity) {
		this.freeCity = freeCity;
	}
}
