package sort.jack.com;

import java.util.ArrayList;
import java.util.List;

public class Bubble {
	public static void main(String arg[]) {

		int[] numbers={5,4,2,4,9,1};
		List<Integer> numbers2=new ArrayList<Integer>();
		numbers2.add(11);
		
		
		for (int j = numbers.length; j > 0; j--) {
			for (int i = 0; i < j-1; i++) {
				if (numbers[i] > numbers[i+1]) {
//					int temp=numbers[i+1];
//					numbers[i+1]=numbers[i];
//					numbers[i]=temp;
					swap(i, numbers);
				}
			}
		}
		for(int a:numbers){
			System.out.println(a);
		}
	}

	private static void swap(int i, int[] a) {
		a[i]=a[i]+a[i+1];
		a[i+1]=a[i]-a[i+1];
		a[i]=a[i]-a[i+1];
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		
	}


}
