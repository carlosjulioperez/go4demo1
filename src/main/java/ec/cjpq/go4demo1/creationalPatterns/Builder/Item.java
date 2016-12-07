package ec.cjpq.go4demo1.creationalPatterns.Builder;

/**
 * Gang of Four Design Patterns Demo 1
 * Item interface representing food item
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public interface Item{

	public String name();
	public Packing packing();
	public float price();

}
