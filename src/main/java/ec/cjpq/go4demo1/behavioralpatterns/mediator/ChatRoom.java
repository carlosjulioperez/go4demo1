package ec.cjpq.go4demo1.behavioralpatterns.mediator;

import java.util.Date;

/**
 * Gang of Four Design Patterns Demo 1
 * Mediator class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-17
 */
public class ChatRoom{

	public static void showMessage(User user, String message){
		System.out.println(new Date().toString() + " [" + user.getName() + "] " + message);
	}
}
