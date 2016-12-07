package ec.cjpq.go4demo1.creationalPatterns.Singleton;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * SingleObject class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public class SingleObjectTest extends TestCase{

	public void test(){

		//Illegal construct
		//Compile Time Error: The constructor SingleObject() is not visible
		//SingleObject singleObject = new SingleObject();
		//
		//Full error message:
		//[ERROR] /home/carper/Documentos/designPatterns/go4demo1/src/test/java/ec/cjpq/go4demo1/creationalPatterns/Singleton/SingleObjectTest.java:[17,45] SingleObject() has private access in ec.cjpq.go4demo1.creationalPatterns.Singleton.SingleObject

		//Get the only object available
		SingleObject singleObject = SingleObject.getInstance();
		
		//show the message
		singleObject.showMessage();

	}
}

