package ec.cjpq.go4demo1.behavioralpatterns.chainofresponsibility;

/**
 * Gang of Four Design Patterns Demo 1
 * Console concrete class extending the Logger class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-13
 */
public class ConsoleLogger extends AbstractLogger{

	public ConsoleLogger(int level){
		this.level = level;
	}

	@Override
	protected void write(String message){
		System.out.println("Standard Console::Logger: " + message);
	}
}
