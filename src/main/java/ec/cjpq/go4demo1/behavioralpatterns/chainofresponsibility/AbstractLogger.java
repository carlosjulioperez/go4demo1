package ec.cjpq.go4demo1.behavioralpatterns.chainofresponsibility;

/**
 * Gang of Four Design Patterns Demo 1
 * Abstract logger class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-13
 */
public abstract class AbstractLogger{

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int level;

	//Next element in chain or responsibility
	protected AbstractLogger nextLogger;

	public void setNextLogger(AbstractLogger nextLogger){
		this.nextLogger = nextLogger;
	}

	public void logMessage(int level, String message){

		if (this.level <= level){
			write(message);
		}
		if (nextLogger != null){
			nextLogger.logMessage(level, message);
		}
	}

	abstract protected void write(String message);
}

