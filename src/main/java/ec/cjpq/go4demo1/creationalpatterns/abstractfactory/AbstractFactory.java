package ec.cjpq.go4demo1.creationalpatterns.abstractfactory;

import ec.cjpq.go4demo1.creationalpatterns.factorymethod.Shape;

/**
 * Gang of Four Design Patterns Demo 1
 * Abstract Factory class to get the factories for Color and Shape objects.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-06
 */
public abstract class AbstractFactory{
	
	abstract Color getColor(String color);
	abstract Shape getShape(String shapeType);

}
