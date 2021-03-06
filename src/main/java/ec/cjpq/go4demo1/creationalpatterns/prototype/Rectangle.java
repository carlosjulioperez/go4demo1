package ec.cjpq.go4demo1.creationalpatterns.prototype;

/**
 * Gang of Four Design Patterns Demo 1
 * Rectangle concrete class extending Shape class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public class Rectangle extends Shape{

	public Rectangle(){
		type = "Rectangle";
	}

	@Override
	public void draw(){
		System.out.println("Inside Rectangle::draw() method.");
	}
}
