package ec.cjpq.go4demo1.behavioralpatterns.chainofresponsibility;

/**
 * Gang of Four Design Patterns Demo 1
 * Error concrete class extending the Logger class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-13
 */
public class ErrorLogger extends AbstractLogger{

	public ErrorLogger(int level){
		this.level = level;
	}

	@Override
	protected void write(String message){
		System.out.println("Error Console::Logger: " + message);
	}
}
