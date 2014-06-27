package observer.jack.com;

public class Customer implements Observer {
	Shop shop;
	Customer(Shop shop) {
		this.shop = shop;
		shop.watch(this);
	}

	@Override
	public void update(int price) {
		System.out.println("Customer get the discount price is: " + price);

	}
	public void watch(Observer ob){
		shop.getObservers().add(ob);
	}
	public void unWatch(Observer ob){
		shop.getObservers().remove(ob);
	}

}
