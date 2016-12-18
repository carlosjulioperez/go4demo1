package ec.cjpq.go4demo1.behavioralpatterns.memento;

/**
 * Gang of Four Design Patterns Demo 1
 * Memento class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class Memento{

	private String state;

	public Memento(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}
}
