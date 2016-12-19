package ec.cjpq.go4demo1.behavioralpatterns.visitor;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * ComputerPart test uses the ComputerPartDisplayVisitor to display parts of Computer. 
 * This class demonstrates the Template Method Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class ComputerPartTest extends TestCase{

	public void test(){
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());

	}
}

