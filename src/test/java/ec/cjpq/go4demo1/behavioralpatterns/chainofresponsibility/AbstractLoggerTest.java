package ec.cjpq.go4demo1.behavioralpatterns.chainofresponsibility;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * AbstractLogger test class creates different types of loggers. 
 * Assign them error levels and set next logger in each logger.
 * Next logger in each logger represents the part of the chain.
 *
 * Demonstrate Chain of Resposibility Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-13
 */
public class AbstractLoggerTest extends TestCase{

	private static AbstractLogger getChainOfLoggers(){

		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

	public void test(){

		AbstractLogger loggerChain = getChainOfLoggers();

		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
	
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is debug information.");

		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");

	}
}

