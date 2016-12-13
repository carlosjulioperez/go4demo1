package ec.cjpq.go4demo1.structuralpatterns.decorator;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * RedShapeDecorator test class to decorate Shape objects. This class demonstrate the Decorator Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-11
 */
public class RedShapeDecoratorTest extends TestCase{

	public void test(){

		Shape circle = new Circle();
		System.out.println("Circle with normal border");
		circle.draw();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		System.out.println("\nCircle of red border");
		redCircle.draw();
		
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("\nRectangle of red border");
		redRectangle.draw();

	}

}

