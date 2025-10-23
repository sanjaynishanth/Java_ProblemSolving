package string;

public class PalindromeString {

	public static void main(String[] args) {
		String str="dod";
		String org=str;
		
		StringBuffer sb =new StringBuffer(str);
		String str1=sb.reverse().toString();
		
		
		
		if(org.equals(str1)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not a palindrome");
		}

	}

}
