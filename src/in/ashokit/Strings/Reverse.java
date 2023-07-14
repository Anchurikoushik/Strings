package in.ashokit.Strings;

public class Reverse {
	public static void main(String[] args) {
		
		String str="maheshbabu";
		
		String output="";
		
	String[]words=str.split("");
	
	for(String word:words) {
		
		String revword="";
		
		for(int i=word.length()-1;i>=0;i--) {
			
			 revword=revword+word.charAt(i);
		}
		output=output+revword+" ";
	}
	System.out.println(output);
		
	}

}


/*
String str="hello";

String output="";

 String [] word=str.split(" ");
 
 for(String words:word) {
	 
	 String revword="";
	 
	 for(int i=words.length()-1;i>=0;i--) {
		revword=revword+ words.charAt(i);
	 }
	 output=output+revword+"";
	 
 }
 
 System.out.println(output);
*/