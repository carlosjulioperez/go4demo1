package ec.cjpq.go4demo1.creationalpatterns.builder;

/**
 * Gang of Four Design Patterns Demo 1
 * VegBurger concrete class extending Burger
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public class VegBurger extends Burger{

	@Override
	public float price(){
		return 25.0f;
	}

	@Override
	public String name(){
		return "Veg Burger";
	}
}
