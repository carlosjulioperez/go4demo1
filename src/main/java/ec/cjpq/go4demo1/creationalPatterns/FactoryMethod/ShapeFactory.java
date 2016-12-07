package ec.cjpq.go4demo1.creationalPatterns.FactoryMethod;

/**
 * Gang of Four Design Patterns Demo 1
 * ShapeFactory class to generate objects to concrete class based of given information
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-05
 */
public class ShapeFactory {

	public Shape getShape(String shapeType){

		if (shapeType == null)
			return null;

		if (shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if (shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}else if (shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}

		return null;
	}

}
