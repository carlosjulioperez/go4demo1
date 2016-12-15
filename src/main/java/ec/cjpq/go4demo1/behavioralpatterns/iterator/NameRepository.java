package ec.cjpq.go4demo1.behavioralpatterns.iterator;

/**
 * Gang of Four Design Patterns Demo 1
 * Concrete class implementing Container interface.
 * This class has inner class NameIterator implementing Iterator interface.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-15
 */
public class NameRepository implements Container{

	public String names[] = {"Robert", "John", "Julie", "Lora"};

	@Override
	public Iterator getIterator(){
		return new NameIterator();
	}

	public class NameIterator implements Iterator{

		int index;
		
		@Override
		public boolean hasNext(){
			if (index < names.length)
				return true;
			return false;
		}

		@Override
		public Object next(){
			if (this.hasNext())
				return names [ index++ ];
			return null;
		}

	}

}

