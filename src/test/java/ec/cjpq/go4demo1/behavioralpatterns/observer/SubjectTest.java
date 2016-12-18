package ec.cjpq.go4demo1.behavioralpatterns.observer;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * Subject test uses Subject and concrete observer objects. This class demonstrates the Observer Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class SubjectTest extends TestCase{

	public void test(){
		Subject subject = new Subject();

		new HexObserver(subject);
		new BinaryObserver(subject);
		new OctalObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);

		System.out.println("Second state change: 10");
		subject.setState(10);

	}
}

