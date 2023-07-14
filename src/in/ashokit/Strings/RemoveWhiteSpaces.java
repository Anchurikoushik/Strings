package in.ashokit.Strings;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		
		String str=" j   a   v   a  s  t  a r  ";
	String str1=str.replaceAll("\\s", "");
		
		System.out.println(str1);
	}

}
