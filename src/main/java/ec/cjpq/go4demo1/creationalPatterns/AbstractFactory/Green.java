package ec.cjpq.go4demo1.creationalPatterns.AbstractFactory;

/**
 * Gang of Four Design Patterns Demo 1
 * Green class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-06
 */
public class Green implements Color{
	@Override
	public void fill(){
		System.out.println("Inside Green::fill() method.");
	}
}
