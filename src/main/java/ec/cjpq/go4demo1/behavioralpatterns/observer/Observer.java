package ec.cjpq.go4demo1.behavioralpatterns.observer;

/**
 * Gang of Four Design Patterns Demo 1
 * Observer class 
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public abstract class Observer{
	protected Subject subject;
	public abstract void update();
}

