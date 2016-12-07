package ec.cjpq.go4demo1.creationalPatterns.AbstractFactory;

import junit.framework.TestCase;
import ec.cjpq.go4demo1.creationalPatterns.FactoryMethod.Shape;

/**
 * Gang of Four Design Patterns Demo 1
 * FactoryProducer Test class uses the FactoryProducer to get AbstractFactory in order to get factories of concrete classes by passing an information such a type.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-06
 */
public class FactoryProducerTest extends TestCase{

	public void test(){

		//Get shape factory 
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		//Get an object of Shape Circle
		Shape circle = shapeFactory.getShape("CIRCLE");

		//Call draw method of Shape Circle
		circle.draw();

		//Get an object of Shape Rectangle
		Shape rectangle = shapeFactory.getShape("RECTANGLE");

		//Call draw method of Shape Rectangle
		rectangle.draw();

		//Get an object of Shape Square
		Shape square = shapeFactory.getShape("SQUARE");

		//Call draw method of Shape Square
		square.draw();

		//Get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		//Get an object of Color Red
		Color red = colorFactory.getColor("RED");

		//Call fill method of RED
		red.fill();
	
		//Get an object of Color Green
		Color green = colorFactory.getColor("GREEN");

		//Call fill method of GREEN
		green.fill();
		
		//Get an object of Color Blue
		Color blue = colorFactory.getColor("BLUE");

		//Call fill method of BLUE
		blue.fill();
	}
}

