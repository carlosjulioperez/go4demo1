package ec.cjpq.go4demo1.structuralpatterns.proxy;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * ProxyImage test class to get object of RealImage class when required. This class demonstrate the Proxy Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-13
 */
public class ProxyImageTest extends TestCase{

	public void test(){

		Image image = new ProxyImage("test_10mb.jpg");

		//Image will be load from disk...
		image.display();
		System.out.println("");

		//Image will NOT be load from disk...
		image.display();
	}
}

