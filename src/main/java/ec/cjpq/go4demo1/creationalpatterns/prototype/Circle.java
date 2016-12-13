package ec.cjpq.go4demo1.creationalpatterns.prototype;

/**
 * Gang of Four Design Patterns Demo 1
 * Circle concrete class extending Shape class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public class Circle extends Shape{

	public Circle(){
		type = "Circle";
	}

	@Override
	public void draw(){
		System.out.println("Inside Circle::draw() method.");
	}
}
