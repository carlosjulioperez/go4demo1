package ec.cjpq.go4demo1.creationalPatterns.AbstractFactory;

import ec.cjpq.go4demo1.creationalPatterns.FactoryMethod.Shape;

/**
 * Gang of Four Design Patterns Demo 1
 * Abstract Factory class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-06
 */
public abstract class AbstractFactory{
	
	abstract Color getColor(String color);
	abstract Shape getShape(String shapeType);

}
