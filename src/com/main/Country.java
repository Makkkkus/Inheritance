package com.main;

import java.util.HashMap;

import com.main.entities.Human;

public class Country {
	public HashMap<Integer, Town> towns = new HashMap<>();
	public Human leader;
	public String name;
	
	public Country(String name, Town... towns) {
		this.name = name;
		
		for (Town town : towns) {
			this.towns.put(this.towns.size()+1, town);
		}
	}
	
	public void addTown(Town t) {
		towns.put(towns.size()+1, t);
	}
	
	public void update() {
		
	}
}
