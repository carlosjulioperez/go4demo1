package ec.cjpq.go4demo1.behavioralpatterns.strategy;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * Context test uses the Context to see change in bahavior when Strategy changes. This class demonstrates the Strategy Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class ContextTest extends TestCase{
	public void test(){
		
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

	}
}

