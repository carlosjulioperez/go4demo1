package ec.cjpq.go4demo1.behavioralpatterns.interpreter;

/**
 * Gang of Four Design Patterns Demo 1
 * Concrete class implementing Expression interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-14
 */
public class TerminalExpression implements Expression{

	private String data;

	public TerminalExpression(String data){
		this.data = data;
	}
	
	@Override
	public boolean interpret(String context){
		if (context.contains(data))
			return true;
		return false;
	}
}
