package com.qjm.builder;

public class Test {
	public static void main(String args[]) {
		MealBuilder mealBulider=new MealBuilder();
		Meal meal=mealBulider.preVergMeal();
		System.out.println(" ﬂ≤À∫∫±§£∫"+meal.getTotal());
		meal.showItem();
		Meal meal2=mealBulider.preChickenMeal();
		System.out.println("º¶»‚∫∫±§£∫"+meal2.getTotal());
		meal2.showItem();
	}
	
}
