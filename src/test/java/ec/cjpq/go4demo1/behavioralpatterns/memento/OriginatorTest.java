package ec.cjpq.go4demo1.behavioralpatterns.memento;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * Originator test uses CareTaker and Originator objects. This class demonstrates the Memento Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class OriginatorTest extends TestCase{

	public void test(){
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();

		originator.setState("State #1");
		originator.setState("State #2");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("State #3");
		careTaker.add(originator.saveStateToMemento());
		
		originator.setState("State #4");
		System.out.println("Current state: " + originator.getState());

		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved state: " + originator.getState());

		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved state: " + originator.getState());

	}
}

