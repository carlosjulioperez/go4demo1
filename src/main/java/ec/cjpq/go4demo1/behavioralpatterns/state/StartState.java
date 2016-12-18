package ec.cjpq.go4demo1.behavioralpatterns.state;

/**
 * Gang of Four Design Patterns Demo 1
 * StartState concrete class implementing the Start interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class StartState implements State{

	public void doAction(Context context){
		System.out.println("Player is in Start state");
		context.setState(this);
	}

	public String toString(){
		return "Start state";
	}

}
