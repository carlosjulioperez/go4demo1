package ec.cjpq.go4demo1.creationalpatterns.abstractfactory;

/**
 * Gang of Four Design Patterns Demo 1
 * FactoryProducer create a Factory generator/producer class to get factories by passing an information such as Shape or Color
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-06
 */ 
public class FactoryProducer{

	public static AbstractFactory getFactory(String choice){
		if (choice.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		}else if (choice.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}
		return null;
	}
}
