package ec.cjpq.go4demo1.structuralpatterns.proxy;

/**
 * Gang of Four Design Patterns Demo 1
 * Concrete class implementing Image interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-13
 */
public class RealImage implements Image{
	
	private String fileName;

	public RealImage(String fileName){
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override	
	public void display(){
		System.out.println("Displaying " + fileName);
	}

	private void loadFromDisk(String fileName){
		System.out.println("Loading " + fileName);
	}
}
