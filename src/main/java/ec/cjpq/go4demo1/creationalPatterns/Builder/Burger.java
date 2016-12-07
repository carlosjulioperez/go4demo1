package ec.cjpq.go4demo1.creationalPatterns.Builder;

/**
 * Gang of Four Design Patterns Demo 1
 * Burger abstract class implementing the Item interface providing default functionalities
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public abstract class Burger implements Item{

	@Override
	public Packing packing(){
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
