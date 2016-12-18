package ec.cjpq.go4demo1.behavioralpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Gang of Four Design Patterns Demo 1
 * Subject class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class Subject{

	private List<Observer> observers = new ArrayList<Observer>();

	private int state;

	public int getState(){
		return state;
	}

	public void setState(int state){
		this.state = state;
		notifyAllObservers();	
	}

	public void attach(Observer observer){
		observers.add(observer);
	}

	public void notifyAllObservers(){
		for (Observer observer: observers)
			observer.update();
	}
}
