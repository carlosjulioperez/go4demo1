package ec.cjpq.go4demo1.behavioralpatterns.interpreter;

/**
 * Gang of Four Design Patterns Demo 1
 * Concrete class implementing Expression interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-14
 */
public class OrExpression implements Expression{

	private Expression expr1 = null;
	private Expression expr2 = null;

	public OrExpression(Expression expr1, Expression expr2){
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public boolean interpret(String context){
		return expr1.interpret(context) || expr2.interpret(context);
	}

}

