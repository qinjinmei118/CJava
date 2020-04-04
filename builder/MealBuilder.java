package com.qjm.builder;

public class MealBuilder {
	public Meal preVergMeal() {
		Meal meal=new Meal();
		meal.addItem(new BurgerEntity());
		meal.addItem(new DrinkEntity());
		return meal;
	}
	public Meal preChickenMeal() {
		Meal meal=new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Coke());
		return meal;
	}
}
