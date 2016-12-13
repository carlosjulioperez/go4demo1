package ec.cjpq.go4demo1.structuralpatterns.flyweight;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * ShapeMaker test class to draw variuos types of shapes. This class demonstrate the facade Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-11
 */
public class ShapeFactoryTest extends TestCase{

	public static final String colors[] = {"Red", "Green", "Blue", "White", "Black" };

	public void test(){

		for (int i=0; i<20; i++){
			Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
			circle.setX( getRandomPosition() );
			circle.setY( getRandomPosition() );
			circle.setRadius (100);
			circle.draw();
		}
	}

	private static String getRandomColor(){
		return colors[ (int) (Math.random() * colors.length ) ];
	}

	private static int getRandomPosition(){
		return (int) (Math.random() * 100) ;
	}
}

