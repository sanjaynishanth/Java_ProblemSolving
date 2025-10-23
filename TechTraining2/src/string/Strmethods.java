package string;
import java.util.*;
public class Strmethods {

	public static void main(String[] args) {
		String str1="java, is a good programming:language";
		String str2="java good language";
		System.out.println(str1.compareTo(str2));//print ascii value difference print g(103)-i(105)
		System.out.println(str1.indexOf(0));//return integer value
		System.out.println(str1.charAt(5));//print value in the specified index
		
		char ch[]=str1.toCharArray();//converting string to char array
		
		Arrays.sort(ch);
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
		String result = str1.replaceAll("[,\\s:]", "");
		System.out.println(result);
	}

}
