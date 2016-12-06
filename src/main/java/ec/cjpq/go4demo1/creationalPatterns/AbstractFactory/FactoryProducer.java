package ec.cjpq.go4demo1.creationalPatterns.AbstractFactory;

/**
 * Gang of Four Design Patterns Demo 1
 * Factory Producer/Generator class
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
