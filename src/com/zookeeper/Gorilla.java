package com.zookeeper;

public class Gorilla extends Mammal{
	public void throwSomething() {
		System.out.println("¡El gorila ha lanzado algo!");
		this.changeEnergy(-5);
		this.displayEnergy();
	}
	
	public void eatBananas() {
		System.out.println("El gorila ha comido una banana, ¡se siente mejor!");
		this.changeEnergy(10);
		this.displayEnergy();
	}
	
	public void climb() {
		System.out.println("¡El gorila ha escalado a la cima de un árbol!");
		this.changeEnergy(-10);
		this.displayEnergy();
	}
	
}
