package Reflect.jack.com;

import junit.framework.TestCase;

//from http://www.cnblogs.com/rollenholt/archive/2011/09/02/2163758.html
public class ReflectDemoTest extends TestCase {
	public void test1() {
		ReflectDemo reflectDemo = new ReflectDemo();
		System.out.println(reflectDemo.getClass().getName());
	}

	public void test2() {

		Class<?> demo1 = null;
		Class<?> demo2 = null;
		Class<?> demo3 = null;
		try {
			// 一般尽量采用这种形式
			demo1 = Class.forName("Reflect.jack.com.ReflectDemo");
		} catch (Exception e) {
			e.printStackTrace();
		}
		demo2 = new ReflectDemo().getClass();
		demo3 = ReflectDemo.class;

		System.out.println("类名称   " + demo1.getName());
		System.out.println("类名称   " + demo2.getName());
		System.out.println("类名称   " + demo3.getName());
	}

	public void test3() throws ClassNotFoundException {
		Class<?> demo = null;
		try {
			demo = Class.forName("Reflect.jack.com.Person");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Person per = null;
		try {
			per = (Person) demo.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		per.setAge(18);
		per.setName("花姑凉");
		System.out.println(per);
	}

	public void test4() {/*
						 * Class<?> demo=null; try{
						 * demo=Class.forName("Reflect.jack.com.Person"); }catch
						 * (Exception e) { e.printStackTrace(); } Person
						 * per1=null; Person per2=null; Person per3=null; Person
						 * per4=null; //取得全部的构造函数 Constructor<?>
						 * cons[]=demo.getConstructors(); try{
						 * //per1=(Person)cons[0].newInstance();
						 * per2=(Person)cons[1].newInstance("Rollen");
						 * per3=(Person)cons[2].newInstance(20);
						 * per4=(Person)cons[3].newInstance("Rollen",20);
						 * }catch(Exception e){ e.printStackTrace(); }
						 * System.out.println(per1); System.out.println(per2);
						 * System.out.println(per3); System.out.println(per4);
						 */
	}

	public void test5() throws ClassNotFoundException {
		Person per1 = null;
		try {
			per1 = (Person) Factory.getClass("Reflect.jack.com.Person");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		per1.setAge(12);
		per1.setName("xiao Hua");
		System.out.println(per1);

	}

}
