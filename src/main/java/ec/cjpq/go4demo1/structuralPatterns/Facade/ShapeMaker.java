package ec.cjpq.go4demo1.structuralPatterns.Facade;

/**
 * Gang of Four Design Patterns Demo 1
 * The Facade class uses the concrete classes to delegate calls to these classes
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-11
 */
public class ShapeMaker{

	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker(){
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawCircle(){
		circle.draw();
	}

	public void drawRectangle(){
		rectangle.draw();
	}

	public void drawSquare(){
		square.draw();
	}

}

