package ec.cjpq.go4demo1.behavioralpatterns.state;

/**
 * Gang of Four Design Patterns Demo 1
 * StopState concrete class implementing the Stop interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class StopState implements State{

	public void doAction(Context context){
		System.out.println("Player is in Stop state");
		context.setState(this);
	}

	public String toString(){
		return "Stop state";
	}

}
