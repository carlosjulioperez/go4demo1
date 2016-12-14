package ec.cjpq.go4demo1.behavioralpatterns.chainofresponsibility;

/**
 * Gang of Four Design Patterns Demo 1
 * File concrete class extending the Logger class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-13
 */
public class FileLogger extends AbstractLogger{

	public FileLogger(int level){
		this.level = level;
	}

	@Override
	protected void write(String message){
		System.out.println("File::Logger: " + message);
	}
}
