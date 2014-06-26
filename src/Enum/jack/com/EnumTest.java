package Enum.jack.com;

import Enum.jack.com.Apple;
import junit.framework.TestCase;

public class EnumTest extends TestCase {
	
	public void test1_Plant(){
		double earthWeight = Double.parseDouble("175");
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for (Planet p : Planet.values()) {
			System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
		}
		
	}
	public void test2_Apple(){
		for (Apple p : Apple.values()) {
			System.out.println(p);
		}
		
	}
	public void test3_Opration(){
		try {
			System.out.println(Operation1.PLUS.apply(1.00, 3.5675));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Operation.DIVIDE.apply(1.00, 3.5675));
		// must use try catch 
		//System.out.println(Operation1.PLUS.apply(1.00, 3.5675));
	}
	
	
}
