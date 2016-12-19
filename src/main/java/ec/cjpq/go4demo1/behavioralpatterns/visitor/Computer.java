package ec.cjpq.go4demo1.behavioralpatterns.visitor;

/**
 * Gang of Four Design Patterns Demo 1
 * ComputerPart interface to represent Element
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class Computer implements ComputerPart{

	ComputerPart[] parts;

	public Computer(){
		parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
	}

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (int i = 0; i < parts.length; i++) {
			parts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}

}
