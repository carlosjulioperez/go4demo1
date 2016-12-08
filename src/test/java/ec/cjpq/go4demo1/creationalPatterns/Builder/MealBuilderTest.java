package ec.cjpq.go4demo1.creationalPatterns.Builder;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * MealBuilder test class uses MealBuilder to demonstrate Builder Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public class MealBuilderTest extends TestCase{

	public void test(){

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total cost: " + vegMeal.getCost() );

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		vegMeal.showItems();
		System.out.println("Total cost: " + nonVegMeal.getCost() );

	}
}

