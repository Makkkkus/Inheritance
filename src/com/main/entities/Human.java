package com.main.entities;

import com.main.Town;

public class Human extends Entity {
	public String name;
	public Town home;
	
	public Human (String name) { this(name, null); }
	public Human (String name, Town home) {
		super();
		this.name = name;
		this.home = home;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Name: " + name);
		System.out.println("Home: " + home);
	}
}
