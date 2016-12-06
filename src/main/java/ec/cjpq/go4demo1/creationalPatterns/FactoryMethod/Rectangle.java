package ec.cjpq.go4demo1.creationalPatterns.FactoryMethod;

/**
 * Gang of Four Design Patterns Demo 1
 * Rectangle class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-05
 */
public class Rectangle implements Shape{
	@Override
	public void draw(){
		System.out.println("Inside Rectangle::draw() method.");
	}
}
