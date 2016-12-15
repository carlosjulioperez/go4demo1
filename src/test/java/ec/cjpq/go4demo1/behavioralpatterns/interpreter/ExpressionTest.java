package ec.cjpq.go4demo1.behavioralpatterns.interpreter;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * Expression test uses Expression class to create rules and then parse them. This class demonstrates the Interpreter Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-14
 */
public class ExpressionTest extends TestCase{

	//Rule: Robert and John are male
	public static Expression getMaleExpression(){
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

	//Role: Julie is a married woman
	public static Expression getMarriedWomanExpression(){
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	public void test(){
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();

		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married woman? " + isMarriedWoman.interpret("Married Julie"));	
	}
}

