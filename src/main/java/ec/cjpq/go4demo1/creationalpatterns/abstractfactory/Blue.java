package ec.cjpq.go4demo1.creationalpatterns.abstractfactory;

/**
 * Gang of Four Design Patterns Demo 1
 * Blue concrete class implementing Color interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-06
 */
public class Blue implements Color{
	@Override
	public void fill(){
		System.out.println("Inside Blue::fill() method.");
	}
}
