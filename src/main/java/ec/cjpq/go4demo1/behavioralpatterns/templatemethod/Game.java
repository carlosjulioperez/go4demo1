package ec.cjpq.go4demo1.behavioralpatterns.templatemethod;

/**
 * Gang of Four Design Patterns Demo 1
 * Game abstract class with a template method being final
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public abstract class Game{

	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();

	//Template method
	public final void play(){

		//Initialize the game
		initialize();

		//Start the game
		startPlay();

		//End the game
		endPlay();
	}
}

