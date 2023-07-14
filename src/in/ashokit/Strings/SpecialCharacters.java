package in.ashokit.Strings;

public class SpecialCharacters {
	public static void main(String[] args) {
		
		String str="@!ja&%va%s$tar";
	String str1=str.replaceAll("[^a-zA-Z0-9]","");
	
	System.out.println(str1);
		
		
	}

}
