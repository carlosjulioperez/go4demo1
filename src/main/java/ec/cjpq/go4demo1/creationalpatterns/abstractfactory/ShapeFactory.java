package ec.cjpq.go4demo1.creationalpatterns.abstractfactory;

import ec.cjpq.go4demo1.creationalpatterns.factorymethod.Circle;
import ec.cjpq.go4demo1.creationalpatterns.factorymethod.Rectangle;
import ec.cjpq.go4demo1.creationalpatterns.factorymethod.Shape;
import ec.cjpq.go4demo1.creationalpatterns.factorymethod.Square;

/**
 * Gang of Four Design Patterns Demo 1
 * Shape Factory class extending abstractfactory to generate objects of concrete clas bases on given information
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-06
 */
public class ShapeFactory extends AbstractFactory{

	@Override
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

	@Override
	public Color getColor(String color){
		return null;
	}
}
