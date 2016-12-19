package ec.cjpq.go4demo1.behavioralpatterns.templatemethod;

/**
 * Gang of Four Design Patterns Demo 1
 * Concrete class extending the Game class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class Cricket extends Game{

	@Override
	void initialize(){
		System.out.println("Cricket Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket Game Started. Enjoy the game!");
	}

	@Override
	void endPlay() {
		System.out.println("Cricket Game Finished!");
	}
}
