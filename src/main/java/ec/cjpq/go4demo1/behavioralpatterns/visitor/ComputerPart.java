package ec.cjpq.go4demo1.behavioralpatterns.visitor;

/**
 * Gang of Four Design Patterns Demo 1
 * ComputerPart interface to represent Element
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public interface ComputerPart{
	public void accept(ComputerPartVisitor computerPartVisitor);
}
