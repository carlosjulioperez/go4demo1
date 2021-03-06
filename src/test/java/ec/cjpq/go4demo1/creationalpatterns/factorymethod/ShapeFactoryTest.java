package ec.cjpq.go4demo1.creationalpatterns.factorymethod;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * ShapeFactory Test class uses the Factory to get objects of concrete class by passing an information such as type. This class demonstrate Abstract Factory Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-05
 */
public class ShapeFactoryTest extends TestCase{

	public void test(){
		ShapeFactory shapeFactory = new ShapeFactory();

		//Get an instance of Circle
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();

		//Get an instance of Rectangle
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		
		//Get an instance of Square
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();

	}
}
