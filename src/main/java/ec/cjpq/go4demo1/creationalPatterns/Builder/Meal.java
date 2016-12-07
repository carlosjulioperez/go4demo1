package ec.cjpq.go4demo1.creationalPatterns.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Gang of Four Design Patterns Demo 1
 * Meal class having Item objects defines previously
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public class Meal{
	
	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item){
		items.add(item);
	}

	public float getCost(){
		float cost = 0.0f;
		for(Item item: items){
			cost += item.price();
		}
		return cost;
	}

	public void showItems(){
		for(Item item: items){
			System.out.print("Item: " + item.name() );
			System.out.print(", Packing: " + item.packing().pack() );
			System.out.println(", Price: " + item.price() );
		}
	}
}
