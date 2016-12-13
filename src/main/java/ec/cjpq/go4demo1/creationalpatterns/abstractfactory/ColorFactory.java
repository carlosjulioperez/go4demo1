package ec.cjpq.go4demo1.creationalpatterns.abstractfactory;

import ec.cjpq.go4demo1.creationalpatterns.factorymethod.Shape;

/**
 * Gang of Four Design Patterns Demo 1
 * Color Factory class extending abstractfactory to generate objects of concrete clas bases on given information
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-06
 */
public class ColorFactory extends AbstractFactory{

	@Override
	public Shape getShape(String color){
		return null;
	}

	@Override
	public Color getColor(String color){

		if (color == null)
			return null;

		if (color.equalsIgnoreCase("RED")){
			return new Red();
		}else if (color.equalsIgnoreCase("GREEN")){
			return new Green();
		}else if (color.equalsIgnoreCase("BLUE")){
			return new Blue();
		}

		return null;
	}

}
