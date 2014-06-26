package factory.jack.com;

import junit.framework.TestCase;

public class FactoryTest extends TestCase {
	public void test1() {
		try {
			Shape shap1= (Shape) Factory.getClass("factory.jack.com.Square");
			shap1.draw();
			Shape shap2= (Shape) Factory.getClass("factory.jack.com.Triangle");
			shap2.draw();
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
