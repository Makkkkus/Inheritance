package com.main.entities;

import java.util.Random;

import com.main.Main;

public class Entity implements Entities {
	private int eid;
	
	public Entity() {
		eid = assignEID();
		Entities.addNewEntity(this);
		if (Main.debug) printInfo();
	}
	
	
	private int assignEID() {
		Random random = new Random();
		
		int rint = random.nextInt();
		if (entities != null) {
			//TODO this may slow the app down when at large amounts of entities
			for (int i = 0; i < entities.size(); i++) {
				if (entities.containsKey(rint))
					rint = random.nextInt();
			}
			
		}
		return rint;
	}
	
	public int getEid() {
		return eid;
	}
	
	public void printInfo() {
		System.out.println("ID: " + this.getEid());
		System.out.println("Type: " + this);
	}
}
