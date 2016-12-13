package ec.cjpq.go4demo1.creationalpatterns.factorymethod;

/**
 * Gang of Four Design Patterns Demo 1
 * Abstract Class Product
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-05
 */
public abstract class Product{
	public void writeName(String name){
		System.out.println("My name is " + name);
	}
}
