package ec.cjpq.go4demo1.behavioralpatterns.command;

/**
 * Gang of Four Design Patterns Demo 1
 * Request class 
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-14
 */
public class Stock{

	private String name = "ABC";
	private int quantity = 10;

	public void buy(){
		System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
	}

	public void sell(){
		System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
	}

}
