package generic.jack.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;
import generic.jack.com.Generic2;;

public class Generic2Test extends TestCase {
	
	public void test1(){
		Set<String> guys = new HashSet<String>(Arrays.asList("Tom", "Dick", "Harry"));
		Set<Integer> guy = new HashSet<Integer>();
		guy.add(1);
		guy.add(2);
		
		Set<String> stooges = new HashSet<String>(Arrays.asList("Larry", "Moe", "Curly"));
		Set<String> aflCio=Generic2.union(guys, stooges);
		
		System.out.println(aflCio);
		
	}
	public void test2(){
		Set<Integer> guy = new HashSet<Integer>(Arrays.asList(1,2,3, 4));
		Set<String> stooges = new HashSet<String>(Arrays.asList("Larry", "Moe", "Curly"));
		Set<String> aflCio=Generic2.union1(guy, stooges);
		
		System.out.println(aflCio);
		
	}
	public void test3_NewHashMap(){
		Map<String, List<String>> anagrams=Generic2.newHashMap();
		anagrams.put("001", Arrays.asList("Larry", "Moe", "Curly"));
		System.out.println(anagrams);
		
		Map<Integer, List<String>> anagrams2=Generic2.newHashMap();
		anagrams2.put(001, Arrays.asList("Larry", "Moe", "Curly"));
		System.out.println(anagrams2);
	}
}
