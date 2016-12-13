package ec.cjpq.go4demo1.creationalpatterns.prototype;

import java.util.Hashtable;

/**
 * Gang of Four Design Patterns Demo 1
 * ShapeCache class to get concrete classes from database and store them in a Hashtable
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public class ShapeCache{

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId){
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape)cachedShape.clone();
	}

	/**
	 * For each Shape run database query and create Shape
	 * shapeMap.put(shapeKey, shape)
	 * for example, we are adding three shapes
	 */ 
	public static void loadCache(){
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);

		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
