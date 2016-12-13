package ec.cjpq.go4demo1.creationalpatterns.builder;

/**
 * Gang of Four Design Patterns Demo 1
 * Bottle concrete class implementing Packing interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public class Bottle implements Packing{

	@Override
	public String pack(){
		return "Bottle";
	}
}
