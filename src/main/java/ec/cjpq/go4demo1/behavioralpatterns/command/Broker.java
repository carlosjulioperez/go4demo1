package ec.cjpq.go4demo1.behavioralpatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Gang of Four Design Patterns Demo 1
 * Command invoker class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-14
 */
public class Broker {

	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order){
		orderList.add(order);
	}

	public void placeOrders(){
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
