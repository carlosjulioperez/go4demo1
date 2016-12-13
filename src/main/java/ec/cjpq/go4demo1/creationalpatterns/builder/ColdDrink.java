package ec.cjpq.go4demo1.creationalpatterns.builder;

/**
 * Gang of Four Design Patterns Demo 1
 * ColdDrink abstract class implementing the Item interface providing default functionalities
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public abstract class ColdDrink implements Item{

	@Override
	public Packing packing(){
		return new Bottle();
	}

	@Override
	public abstract float price();
}
