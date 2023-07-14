package in.ashokit.Strings;

import java.util.Arrays;

public class OccurenceToNumber {
	public static void main(String[] args) {
		
		String str="akashamantha ";
		char replace='a';
		
		if(str.indexOf(replace)==-1) {
			System.out.println("the given character is not present in the String");
			System.exit(0);
		}
		
		char[]arr=str.toCharArray();
		int cnt=1;
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==replace) {
				arr[i]=String.valueOf(cnt).charAt(0);
				cnt++;
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
		}
	

}
