package ec.cjpq.go4demo1.creationalPatterns.Builder;

/**
 * Gang of Four Design Patterns Demo 1
 * Wrapper concrete class implementing Packing interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public class Wrapper implements Packing{

	@Override
	public String pack(){
		return "Wrapper";
	}
}
