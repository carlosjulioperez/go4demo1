package ec.cjpq.go4demo1.structuralpatterns.decorator;

/**
 * Gang of Four Design Patterns Demo 1
 * Concrete decorator class extending the Shapedecorator class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-11
 */
public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape decoratedShape){
		super(decoratedShape);
	}

	@Override
	public void draw(){
		decoratedShape.draw();
		setRedBorder();
	}

	private void setRedBorder(){
		System.out.println("Border Color: Red");
	}

}
