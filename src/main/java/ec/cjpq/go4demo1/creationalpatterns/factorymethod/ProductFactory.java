package ec.cjpq.go4demo1.creationalpatterns.factorymethod;

/**
 * Gang of Four Design Patterns Demo 1
 * Class ProductFactory
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-05
 */
public class ProductFactory{

	Product createProduct(String type){

		if (type.equals("B"))
			return new ProductB();
		else
			return new ProductA();

	}
}
