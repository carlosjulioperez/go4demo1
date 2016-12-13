package ec.cjpq.go4demo1.creationalpatterns.factorymethod;

/**
 * Gang of Four Design Patterns Demo 1
 * Class ProductB
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-05
 */
public class ProductB extends Product{
	public void writeName(String name){
		System.out.println("My reversed name is " + new StringBuilder().append(name).reverse() );
	}
}
