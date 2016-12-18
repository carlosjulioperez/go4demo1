package ec.cjpq.go4demo1.behavioralpatterns.strategy;

/**
 * Gang of Four Design Patterns Demo 1
 * Concrete class implementing Strategy interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class OperationMultiply implements Strategy{

	@Override
	public int doOperation(int num1, int num2){
		return num1 * num2;
	}

}
