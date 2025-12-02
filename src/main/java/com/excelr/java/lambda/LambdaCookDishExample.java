package com.excelr.java.lambda;

import java.util.ArrayList;
import java.util.List;

interface cook{
	void prepareDish(String dishName);
}
public class LambdaCookDishExample {
	
	public static void main(String[] args) {
		List <String> indianDishes =new ArrayList<> ();
		indianDishes.add("biriyani");
		indianDishes.add("pulav");
		
			
		cook preparing = (dishName)->{
			System.out.println("preparing "+dishName);
		};
		
		for(String dish : indianDishes) {
			preparing.prepareDish(dish);
			System.out.println();
		}
	}

}
