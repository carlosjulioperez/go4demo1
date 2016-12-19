package ec.cjpq.go4demo1.behavioralpatterns.visitor;

/**
 * Gang of Four Design Patterns Demo 1
 * Create concrete visitor implementing ComputerPartVisitor
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{

	@Override
	public void visit(Computer computer) {
		System.out.println("Displaying Computer.");
	}
	@Override
	public void visit(Mouse mouse) {
		System.out.println("Displaying Mouse.");
	}
	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Displaying Keyboard.");
	}
	@Override
	public void visit(Monitor monitor) {
		System.out.println("Displaying Monitor.");
	}

}
