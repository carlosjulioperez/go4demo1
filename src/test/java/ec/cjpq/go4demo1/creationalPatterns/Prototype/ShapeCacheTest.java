package ec.cjpq.go4demo1.creationalPatterns.Prototype;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * ShapeCacheTest class uses ShapeCache class to get clones of shapes stored in a Hashtable. This class demonstrate Prototype Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public class ShapeCacheTest extends TestCase{

	public void test(){

		ShapeCache.loadCache();

		Shape clonedShape1 = (Shape)ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape1.getType());

		Shape clonedShape2 = (Shape)ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = (Shape)ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());

	}

}

