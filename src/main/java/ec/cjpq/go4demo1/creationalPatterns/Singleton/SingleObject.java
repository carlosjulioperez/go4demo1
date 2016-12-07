package ec.cjpq.go4demo1.creationalPatterns.Singleton;

/**
 * Gang of Four Design Patterns Demo 1
 * SingleObject class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public class SingleObject{

	//Create an object of SingleObject
	private static SingleObject instance = new SingleObject();

	//Make the constructor private so that this class can not be instantiated
	private SingleObject(){}

	//Get the only object available
	public static SingleObject getInstance(){
		return instance;
	}

	//Print the greeting message of the alive object...
	public void showMessage(){
		System.out.println("Hello world, I'm a single object ;)");
	}
}

