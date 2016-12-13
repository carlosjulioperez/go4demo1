package ec.cjpq.go4demo1.creationalpatterns.prototype;

/**
 * Gang of Four Design Patterns Demo 1
 * Square concrete class extending Shape class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public class Square extends Shape{

	public Square(){
		type = "Square";
	}

	@Override
	public void draw(){
		System.out.println("Inside Square::draw() method.");
	}
}
