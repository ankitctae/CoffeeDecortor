package com.starbuzz.coff;

public class ToppingCoffee extends ToppingDecorator {

	private Beverage beverage;

	public ToppingCoffee(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDiscription() {
		return beverage.getDiscription() + ", ToppingCoffee";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 5 + beverage.cost();
	}

}
