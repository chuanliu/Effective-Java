package observer.jack.com;

import junit.framework.TestCase;

public class ObserverTest extends TestCase {
	public void test1() {
		Shop shop = new Shop();
		Customer cu1 = new Customer(shop);
		Customer cu2 = new Customer(shop);
		shop.updatePrice(998);
		cu2.unWatch();
		shop.updatePrice(998);
	}

}
