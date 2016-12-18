package ec.cjpq.go4demo1.behavioralpatterns.memento;

/**
 * Gang of Four Design Patterns Demo 1
 * Originator class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class Originator{
	
	private String state;

	public String getState(){
		return state;
	}

	public void setState(String state){
		this.state = state;
	}

	public Memento saveStateToMemento(){
		return new Memento(state);
	}

	public void getStateFromMemento(Memento memento){
		state = memento.getState();
	}
}
