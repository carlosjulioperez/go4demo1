package ec.cjpq.go4demo1.behavioralpatterns.mediator;

/**
 * Gang of Four Design Patterns Demo 1
 * User class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-17
 */
public class User{

	public String name;

	public User (String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void sendMessage(String message){
		ChatRoom.showMessage(this, message);
	}
}
