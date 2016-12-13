package ec.cjpq.go4demo1.creationalpatterns.singleton;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * SingleObject class get the only object from the singleton class. This class demonstrate singleton Pattern.
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
		//[ERROR] /home/carper/Documentos/designPatterns/go4demo1/src/test/java/ec/cjpq/go4demo1/creationalpatterns/singleton/SingleObjectTest.java:[17,45] SingleObject() has private access in ec.cjpq.go4demo1.creationalpatterns.singleton.SingleObject

		//Get the only object available
		SingleObject singleObject = SingleObject.getInstance();
		
		//show the message
		singleObject.showMessage();

	}
}

