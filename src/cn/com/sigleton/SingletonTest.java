package cn.com.sigleton;

import junit.framework.TestCase;

public class SingletonTest extends TestCase {
	public void testcase1(){
		try {
		//Class.forName("cn.com.sigleton.Singleton"); // Class for name 会装载这个类~~
		Singleton instance = Singleton.getInstance();
		instance.print();
		Singleton instance2 = Singleton.getInstance();
		instance2.print();
		Singleton instance3 = Singleton.getInstance();
		instance3.print();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
