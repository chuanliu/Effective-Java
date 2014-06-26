package generic.jack.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Generic2 {
	// Generic method.
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<E>(s1);
		result.addAll(s2);
		return result;

	}

	// if not use E, we will get the validation waring.
	public static Set union1(Set s1, Set s2) {
		Set result = new HashSet(s1);
		result.addAll(s2);
		return result;

	}

	public static <K, V> HashMap<K, V> newHashMap() {

		return new HashMap<K, V>();

	}
	
	public interface UnaryFunction<T>{
		T apply(T arg);
	}
	
	

}
