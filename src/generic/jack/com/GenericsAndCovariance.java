package generic.jack.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsAndCovariance {
	public static void main(String[] args) {
		// Wildcards allow covariance:
		List<? extends Fruit> flist = new ArrayList<Apple>();
		// List<Apple> flist2 = new ArrayList<Apple>();
		// flist2.add(new Apple());
		// flist=flist2;

		Fruit[] fruit = new Apple[10];
		// Compile Error: can’t add any type of object:
		// flist.add(new Apple());
		// flist.add(new Fruit());
		// flist.add(new Object());
		flist.add(null); // Legal but uninteresting
		// We know that it returns at least Fruit:
		Fruit f = flist.get(0);
		System.out.println(f);

		List<? extends Fruit> flist3 = Arrays.asList(new Apple(), new Fruit());
		Apple a = (Apple) flist3.get(0); // No warning
		flist3.contains(new Apple()); // Argument is ‘Object’
		flist3.indexOf(new Apple()); // Argument is ‘Object’
	}
}
