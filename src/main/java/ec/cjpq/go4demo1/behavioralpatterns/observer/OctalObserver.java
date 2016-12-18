package ec.cjpq.go4demo1.behavioralpatterns.observer;

/**
 * Gang of Four Design Patterns Demo 1
 * OctalObserver concrete Observer class 
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class OctalObserver extends Observer{

	public OctalObserver(Subject subject){
		this.subject = subject;
		this.subject.attach (this);
	}

	@Override
	public void update(){
		System.out.println("Octal String: " + Integer.toOctalString( subject.getState() ) );
	}

}

