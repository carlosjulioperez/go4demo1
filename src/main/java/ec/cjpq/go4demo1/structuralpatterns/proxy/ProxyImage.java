package ec.cjpq.go4demo1.structuralpatterns.proxy;

/**
 * Gang of Four Design Patterns Demo 1
 * Concrete class implementing Image interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-13
 */
public class ProxyImage implements Image{
	
	private String fileName;
	private RealImage realImage;

	public ProxyImage(String fileName){
		this.fileName = fileName;
	}

	@Override	
	public void display(){
		
		if (realImage == null){
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
