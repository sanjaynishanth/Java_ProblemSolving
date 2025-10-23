package string;
import java.util.*;
public class FrequencyString {

	public static void main(String[] args) {
		String str1="prasanth";
		char ch[]=str1.toCharArray();//converting string to char array
		
		HashMap<Character,Integer> hm=new HashMap<>();
		
		for(char c:ch) {
			hm.put(c,hm.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character,Integer> res:hm.entrySet()) {
			System.out.println(res.getKey()+" "+res.getValue());
			
		}
		
		
		
		

	}
}
