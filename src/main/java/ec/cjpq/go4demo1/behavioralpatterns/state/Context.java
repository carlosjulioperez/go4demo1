package ec.cjpq.go4demo1.behavioralpatterns.state;

/**
 * Gang of Four Design Patterns Demo 1
 * Cotext class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class Context{

	private State state;

	public Context(){
		state = null;
	}

	public void setState(State state){
		this.state = state;
	}

	public State getState(){
		return state;
	}
}
