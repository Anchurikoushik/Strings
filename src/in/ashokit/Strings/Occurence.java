package in.ashokit.Strings;

import java.util.HashMap;
import java.util.Map;

public class Occurence {

	public static void main(String[] args) {
 String str="koushik";
 
 Map<Character,Integer> map=new HashMap();
 char[] chars=str.toCharArray();
 
 for(char ch:chars) {
	 
	 if(!map.containsKey(ch)) {
		 map.put(ch, 1);
		 
	 }else
	 {
		int idx= map.get(ch);
		map.put(ch, idx+1);
	 }
	 
 }
 System.out.println(map);
 
	}

}
