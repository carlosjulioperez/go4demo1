package ec.cjpq.go4demo1.behavioralpatterns.strategy;

/**
 * Gang of Four Design Patterns Demo 1
 * Context class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class Context{

	private Strategy strategy;

	public Context (Strategy strategy){
		this.strategy = strategy;
	}

	public int executeStrategy(int num1, int num2){
		return strategy.doOperation(num1, num2);
	}
}
