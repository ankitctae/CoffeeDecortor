package com.starbuzz.coff;

public class Main {

	public static void main(String[] args) {
		Beverage coffee=new Coffee();
		ToppingDecorator dc=new ToppingCoffee(coffee);
		ToppingDecorator dc2=new ToppingCoffee(dc);
		System.out.println(dc2.getDiscription());
		System.out.println(dc2.cost());
		
	}
}
