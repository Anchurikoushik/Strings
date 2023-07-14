package in.ashokit.Strings;

import java.util.HashMap;
import java.util.Map;

public class StringOccurence {
	
	public static void main(String[] args) {
		
		String str="pushpa";
		
		Map<Character,Integer>map=new HashMap();
		
		char[]words=str.toCharArray();
		for(char ch:words) {
			if(!map.containsKey(ch)) {
				map.put(ch,1);
				
			}
			else {
				int index=map.get(ch);
				map.put(ch, index+1);
				
			}
		}
		
		System.out.println(map);
	}

}
