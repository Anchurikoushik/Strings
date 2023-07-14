package in.ashokit.Strings;

import java.util.Arrays;

public class LetterOccurence {
	
	
	public static void main(String[] args) {
		
		String str="koushik";
		char replace='n';
		
		
		if(str.indexOf(replace)==-1){
			System.out.println("that character is not there in the given string");
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
