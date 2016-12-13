package ec.cjpq.go4demo1.creationalpatterns.builder;

/**
 * Gang of Four Design Patterns Demo 1
 * Mealbuilder class, the actual builder class responsible to create Meal objects
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public class MealBuilder{

	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
