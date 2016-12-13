package ec.cjpq.go4demo1.creationalpatterns.builder;

/**
 * Gang of Four Design Patterns Demo 1
 * ChickenBurger concrete class extending Burger
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public class ChickenBurger extends Burger{

	@Override
	public float price(){
		return 50.5f;
	}

	@Override
	public String name(){
		return "Chicken Burger";
	}
}
