package ec.cjpq.go4demo1.behavioralpatterns.observer;

/**
 * Gang of Four Design Patterns Demo 1
 * HexObserver concrete Observer class 
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class HexObserver extends Observer{

	public HexObserver(Subject subject){
		this.subject = subject;
		this.subject.attach (this);
	}

	@Override
	public void update(){
		System.out.println("Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
	}

}

