package ec.cjpq.go4demo1.behavioralpatterns.state;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * Context test uses the Context to see change in bahavior when State changes. This class demonstrates the State Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class ContextTest extends TestCase{

	public void test(){
		
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());

	}
}
