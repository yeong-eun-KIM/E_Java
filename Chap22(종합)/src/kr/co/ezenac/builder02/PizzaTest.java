package kr.co.ezenac.builder02;

import kr.co.ezenac.builder02.Pizza.Topping;

public class PizzaTest {

	public static void main(String[] args) {
		
		Pizza nyPizza = new NyPizza.Builder(NyPizza.Size.MEDIUM).addTopping(Pizza.Topping.MUSHROOM).addTopping(Pizza.Topping.ONION).build();
		
		System.out.println(nyPizza);
		
		Pizza Calzone = new Calzone.Builder().addTopping(Pizza.Topping.PEPPER).sauceInside().build();
		
		System.out.println(Calzone);
		
		
	}
	
}
