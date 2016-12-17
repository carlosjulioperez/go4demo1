package ec.cjpq.go4demo1.behavioralpatterns.mediator;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * User test uses the User object to show communications between them. This class demonstrates the Mediator Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-17
 */
public class UserTest extends TestCase{

	public void test(){
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi John!");
		john.sendMessage("Hello Robert");
	}
}
