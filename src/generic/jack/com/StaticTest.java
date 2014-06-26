package generic.jack.com;
//http://justjavac.iteye.com/blog/1741638
//Q3.泛型类的静态变量是共享的？——Yes
//答案是——2！由于经过类型擦除，所有的泛型类实例都关联到同一份字节码上，泛型类的所有静态变量是共享的。
//五、Just remember
//1.虚拟机中没有泛型，只有普通类和普通方法
//2.所有泛型类的类型参数在编译时都会被擦除
//3.创建泛型对象时请指明类型，让编译器尽早的做参数检查（Effective Java，第23条：请不要在新代码中使用原生态类型）
//4.不要忽略编译器的警告信息，那意味着潜在的ClassCastException等着你
public class StaticTest {
	public static void main(String[] args) {
		GT<Integer> gti = new GT<Integer>();
		gti.var = 1;
		GT<String> gts = new GT<String>();
		gts.var = 2;
		System.out.println(gti.var);
	}
}

class GT<T> {
	public static int var = 0;

	public void nothing(T x) {
	}
}
