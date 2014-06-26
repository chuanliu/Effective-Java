package generic.jack.com;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
//http://blog.csdn.net/hui_lang/article/details/7552564  Java中泛型是类型擦除的
//http://icyfenix.iteye.com/blog/1021949
public class Invoke {
	public static void main(String args[]) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("abc");
		// 下面一句则会出错，被编译器检查出与泛型信息不匹配
		// lista.add(1);
		lista.getClass().getMethod("add", Object.class).invoke(lista, 1);
		System.out.println(lista);

		List<String> ls = new ArrayList<String>();
		List<Integer> li = new ArrayList<Integer>();
		System.out.println(ls.getClass() == li.getClass());
	}

	public void listMethod(List<String> stringList) {
	}
	// public void listMethod(List<Integer> intList) {
	// }
	
}
