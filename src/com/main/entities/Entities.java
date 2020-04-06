package com.main.entities;

import java.util.HashMap;

public interface Entities {
	static HashMap<Integer, Entity> entities = new HashMap<>();
	
	public static Entity getEntity(Entity e) {
		return entities.get(e.getEid());
	}
	
	public static Entity getEntityByID(int id) {
		return entities.get(id);
	}
	
	public static Entity getNewestEntity() {		
		return null;
	}
	
	public static void addNewEntity(Entity e) {
		entities.put(e.getEid(), e);
	}
}
