package ec.cjpq.go4demo1.structuralpatterns.bridge;

/**
 * Gang of Four Design Patterns Demo 1
 * Circle concrete class implementing the Shape interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-08
 */
public class Circle extends Shape{

	private int x, y, radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI){
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void draw(){
		drawAPI.drawCircle(radius, x, y);
	}
}
