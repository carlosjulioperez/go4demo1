package ec.cjpq.go4demo1.structuralPatterns.Bridge;

/**
 * Gang of Four Design Patterns Demo 1
 * Shape abstract class using the DrawAPI interface 
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-08
 */
public abstract class Shape{

	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
