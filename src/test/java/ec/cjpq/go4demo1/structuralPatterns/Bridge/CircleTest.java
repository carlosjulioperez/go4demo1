package ec.cjpq.go4demo1.structuralPatterns.Bridge;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * Circle test class using DrawAPI classes to draw differen colered circles. This class demonstrate Bridge Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-09
 */
public class CircleTest extends TestCase{

	public void test(){

		Shape redCircle = new Circle(100, 100, 10, new RedCircle() );
		Shape greenCircle = new Circle(300, 100, 10, new GreenCircle() );

		redCircle.draw();
		greenCircle.draw();
	}

}

