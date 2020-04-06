package com.main;

import com.main.entities.Human;

public class Main {
	public static boolean debug = true;
	
	public static void main(String[] args) {
		Country Norway = new Country("Norway", new Town("Kakka"));
		Norway.leader = new Human("GamerEpic");
		
		Norway.addTown(new Town("Ooga"));
	}
}
