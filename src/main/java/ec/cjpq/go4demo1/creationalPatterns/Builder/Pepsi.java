package ec.cjpq.go4demo1.creationalPatterns.Builder;

/**
 * Gang of Four Design Patterns Demo 1
 * Pepsi concrete class extending ColdDrink
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public class Pepsi extends ColdDrink{

	@Override
	public float price(){
		return 35.0f;
	}

	@Override
	public String name(){
		return "Pepsi";
	}
}
