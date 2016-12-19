package ec.cjpq.go4demo1.behavioralpatterns.templatemethod;

/**
 * Gang of Four Design Patterns Demo 1
 * Concrete class extending the Game class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class Football extends Game{

	@Override
	void initialize(){
		System.out.println("Football Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Football Game Started. Enjoy the game!");
	}

	@Override
	void endPlay() {
		System.out.println("Football Game Finished!");
	}
}
