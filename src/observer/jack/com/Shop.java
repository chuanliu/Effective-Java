package observer.jack.com;

import java.util.ArrayList;
import java.util.List;

public class Shop {
	private List<Observer> observers;
	public List<Observer> getObservers() {
		return observers;
	}
	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}
	private int price;
	
	Shop() {
		this.observers = new ArrayList<Observer>();
	}
	public void updatePrice(int price) {
		this.price = price;
		notification();
		
	}

	private void notification() {
		for(Observer ob: observers)
			ob.update(this.price);
	}
	public void watch(Observer ob){
		observers.add(ob);
	}
	public void unWatch(Observer ob){
		observers.remove(ob);
	}


	

}
