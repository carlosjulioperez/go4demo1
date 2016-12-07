package ec.cjpq.go4demo1.creationalPatterns.AbstractFactory;

/**
 * Gang of Four Design Patterns Demo 1
 * Red concrete class implementing Color interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-06
 */
public class Red implements Color{
	@Override
	public void fill(){
		System.out.println("Inside Red::fill() method.");
	}
}
