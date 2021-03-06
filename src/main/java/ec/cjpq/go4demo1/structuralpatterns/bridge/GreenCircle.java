package ec.cjpq.go4demo1.structuralpatterns.bridge;

/**
 * Gang of Four Design Patterns Demo 1
 * GreenCircle concrete bridge implementor class implementing the DrawAPI interface 
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-08
 */
public class GreenCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y){
		System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
	}

}
