package ec.cjpq.go4demo1.creationalpatterns.builder;

/**
 * Gang of Four Design Patterns Demo 1
 * Coke concrete class extending ColdDrink
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public class Coke extends ColdDrink{

	@Override
	public float price(){
		return 30.0f;
	}

	@Override
	public String name(){
		return "Coke";
	}
}
