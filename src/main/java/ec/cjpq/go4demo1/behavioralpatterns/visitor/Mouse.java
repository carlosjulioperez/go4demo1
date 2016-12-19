package ec.cjpq.go4demo1.behavioralpatterns.visitor;

/**
 * Gang of Four Design Patterns Demo 1
 * Concrete class extending ComputerPart interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class Mouse implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor){
		computerPartVisitor.visit(this);
	}
}
