package com.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		this.setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("*El murciélago bate sus alas con fuerza*");
		this.changeEnergy(-50);
		this.displayEnergy();
	}
	
	public void eatHumans() {
		System.out.println("Bueno, no importa *emote del fortnite*");
		this.changeEnergy(25);
		this.displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("*Sonido de ciudad en llamas*");
		this.changeEnergy(-100);
		this.displayEnergy();
	}
	
}
