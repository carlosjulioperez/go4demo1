package ec.cjpq.go4demo1.structuralPatterns.Decorator;

/**
 * Gang of Four Design Patterns Demo 1
 * Concrete abstract Decorator class implementing the Shape interface 
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-11
 */
public abstract class ShapeDecorator implements Shape{

	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape){
		this.decoratedShape = decoratedShape;
	}

	public void draw(){
		decoratedShape.draw();
	}
}
