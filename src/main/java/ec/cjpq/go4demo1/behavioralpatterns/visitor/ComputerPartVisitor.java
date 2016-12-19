package ec.cjpq.go4demo1.behavioralpatterns.visitor;

/**
 * Gang of Four Design Patterns Demo 1
 * ComputerPartVisitor interface to represent Visitor
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public interface ComputerPartVisitor{
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
