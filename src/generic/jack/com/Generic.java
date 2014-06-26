package generic.jack.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Generic {
	
	     /**
	      * @param args
	      */
	     public static void main(String[] args) {
	           // TODO Auto-generated method stub
	          List<String> strings = new ArrayList<String>();
	           //方法add1和add2显示了List和List<Object>的区别
	           //方法add1
	           //由于参数是List，当把List<String>作为参数传进来时，list添加了一个Integer类型，
	           //string列表中添加了Integer类型的元素，破坏了安全性
	           add1(strings,new Integer(1));
	          String s = strings.get(0); //出错，因为是Integer类型
	          
	           //方法add2无法通过编译，因为无法接受List<String>作为参数
	           //The method add2(List<Object>, Object) in the type ListDemo is
	           //not applicable for the arguments (List<String>, Integer)
	           //add2(strings,new Integer(1));
	          
	           //方法add1和add3显示了List和List<?>的区别
	           //方法add3无法通过编译，List<?>一般只能用于读取，不能add，除非是null
	           //The method add(capture#1-of ?) in the type List<capture#1-of ?>
	           //is not applicable for the arguments (Object)
	           add3(strings,new Integer(1));
	          
	           
	           
//	           List<String>[] stringLists= new Arrays<String>[1];
//	           List<Integer> intList = Arrays.asList(42);
//	           Object[] objects = stringLists;
//	           objects[0]=intList;
//	           String ss= stringLists[0].get(0);
	          

	     }
	     private static void add1(List list,Object o)
	     {
	           list.add(o);
	     }
	     private static void add2(List<Object> list,Object o)
	     {
	          list.add(o);
	     }
	     private static void add3(List<?> list,Object o)
	     {
	          //list. add(o);//错误
	          list.add(null);//正确，可以添加null

	     }


}
