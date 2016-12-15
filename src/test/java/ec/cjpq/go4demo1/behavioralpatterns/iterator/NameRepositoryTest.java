package ec.cjpq.go4demo1.behavioralpatterns.iterator;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * NameRepository uses NameRepository to get iterator and print names. This class demonstrates the Iterator Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-15
 */
public class NameRepositoryTest extends TestCase{

	public void test(){
		NameRepository namesRepository = new NameRepository();
		for(Iterator iterator = namesRepository.getIterator(); iterator.hasNext(); ){
			String name = (String)iterator.next();
			System.out.println("Name: " + name);
		}
	}
}

