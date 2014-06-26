package generic.jack.com;

import java.util.ArrayList;
import java.util.List;

public class SuperTypeWildcards {
	static void writeTo(List<? super Apple> apples) {
		apples.add(new Apple());
		apples.add(new Jonathan());
//		 apples.add(new Fruit()); // Error
		Object a = apples.get(0);
		System.out.println(a);
	}
	public static void main(String arg[]){
		writeTo(new ArrayList<Object>());
	}
}
