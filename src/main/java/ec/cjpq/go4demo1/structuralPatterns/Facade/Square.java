package ec.cjpq.go4demo1.structuralPatterns.Facade;

/**
 * Gang of Four Design Patterns Demo 1
 * Square concrete class implementing Shape interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-11
 */
public class Square implements Shape{
	@Override
	public void draw(){
		System.out.println("Inside Square::draw() method.");
	}
}
