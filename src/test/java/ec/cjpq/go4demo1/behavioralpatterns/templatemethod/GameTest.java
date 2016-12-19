package ec.cjpq.go4demo1.behavioralpatterns.templatemethod;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * Game test uses the Game's template method play() to demostrate a defined way of playing game. 
 * This class demonstrates the Template Method Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class GameTest extends TestCase{
	public void test(){
		Game game = new Cricket();
		game.play();

		System.out.println();
		
		game = new Football();
		game.play();

	}
}
