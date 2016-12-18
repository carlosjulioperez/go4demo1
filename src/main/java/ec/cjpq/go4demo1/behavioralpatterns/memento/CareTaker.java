package ec.cjpq.go4demo1.behavioralpatterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Gang of Four Design Patterns Demo 1
 * CareTaker class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-18
 */
public class CareTaker{

	private List<Memento> mementoList = new ArrayList<Memento>();

	public void add(Memento state){
		mementoList.add(state);
	}

	public Memento get(int index){
		return mementoList.get(index);
	}
}

