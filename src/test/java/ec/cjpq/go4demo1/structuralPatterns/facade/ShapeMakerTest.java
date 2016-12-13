package ec.cjpq.go4demo1.structuralpatterns.facade;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * ShapeMaker test class to draw variuos types of shapes. This class demonstrate the facade Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-11
 */
public class ShapeMakerTest extends TestCase{

	public void test(){
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
