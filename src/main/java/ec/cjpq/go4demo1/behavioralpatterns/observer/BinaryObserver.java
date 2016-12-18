package ec.cjpq.go4demo1.behavioralpatterns.observer;

/**
 * Gang of Four Design Patterns Demo 1
 * BinaryObserver concrete Observer class 
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class BinaryObserver extends Observer{

	public BinaryObserver(Subject subject){
		this.subject = subject;
		this.subject.attach (this);
	}

	@Override
	public void update(){
		System.out.println("Binary String: " + Integer.toBinaryString( subject.getState() ) );
	}

}

