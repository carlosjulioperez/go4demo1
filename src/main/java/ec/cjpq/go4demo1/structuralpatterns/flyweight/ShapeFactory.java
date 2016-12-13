package ec.cjpq.go4demo1.structuralpatterns.flyweight;

import java.util.HashMap;

/**
 * Gang of Four Design Patterns Demo 1
 * Factory to generate the object of concrete class based on given information
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-11
 */
public class ShapeFactory{

	public static final HashMap<String, Shape> circleMap = new HashMap();

	public static Shape getCircle(String color){

		Circle circle = (Circle)circleMap.get(color);

		if (circle == null){
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color: " + color);
		}
		return circle;
	}
}
