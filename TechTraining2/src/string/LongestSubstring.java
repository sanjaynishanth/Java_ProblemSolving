package string;
import java.util.*;
public class LongestSubstring {

	public static void main(String[] args) {
		String s="abcabcbb";
		int n=s.length();
		
		HashSet<Character>set=new HashSet<>();
		
		int left=0;
		int max=0;
		int st=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			while(set.contains(c)) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(c);
			
			if(n-left>max) {
				max=i-left+1;
				st=left;
				
			}
		}
//		System.out.println(st);
		
		System.out.println(max);
		String s1=s.substring(st, st+max);
		System.out.println(s1);
	}

}
