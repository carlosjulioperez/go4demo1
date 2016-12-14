package ec.cjpq.go4demo1.behavioralpatterns.command;

/**
 * Gang of Four Design Patterns Demo 1
 * Concrete classes implementing the Order interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-14
 */
public class BuyStock implements Order{

	private Stock abcStock;

	public BuyStock(Stock abcStock){
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.buy();
	}
}
