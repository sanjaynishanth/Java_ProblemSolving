package string;
import java.util.*;

public class WordBreakleetcode139 {

	public static void main(String[] args) {
		String s="leetcode";
		List<String>li=Arrays.asList("leet","code");
		Set<String>set=new HashSet<>(li);
//		System.out.println(set);
		
		boolean arr[]=new boolean[s.length()+1];
		arr[0]=true;
		
		for(int i=1;i<=s.length();i++) {
			for(int j=0;j<i;j++) {
				String substr=s.substring(j,i);
				
				if(arr[j] && set.contains(substr)) {
					arr[i]=true;
					break;
				}
			}
		}
		System.out.println(arr[s.length()]);
	}

}
