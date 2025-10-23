//There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.

//Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters 
//of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.

package string;
import java.util.*;

public class MaximumNoOfWordsTypes1935 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		String s="leet code";
		String brokenLetters="e";
		char c[]=brokenLetters.toCharArray();
		List<Character>li=new ArrayList<>();
		for(char ch:c) {
			li.add(ch);
		}
		String word[]=s.split(" ");
		
		
		for(String s1:word) {
			char temp[]=s1.toCharArray();
			
			boolean flag=true;
			for(char ch:temp) {
				if(li.contains(ch)) {
					flag=false;
					break;
					
				}
			}
			if(flag) {
				count+=1;
			}
		}
		
		System.out.println(count);
		
		

	}

}
