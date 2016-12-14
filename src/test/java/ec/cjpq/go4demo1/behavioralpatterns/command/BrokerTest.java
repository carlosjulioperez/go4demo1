package ec.cjpq.go4demo1.behavioralpatterns.command;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * Broker test class to take and executes commands. This class demonstrates the Command Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-14
 */
public class BrokerTest extends TestCase{

	public void test(){

		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}

