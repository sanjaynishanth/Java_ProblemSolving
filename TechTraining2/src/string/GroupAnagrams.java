package string;
import java.util.*;
public class GroupAnagrams {

	public static void main(String[] args) {
		String arr[]= {"eat","tea","tan","ate","nat","bat"};
		List<String>li=Arrays.asList(arr);
		
		Map<String,List<String>> res=new HashMap<>();
		for(String s:arr) {
			char c[]=s.toCharArray();
			Arrays.sort(c);
			
			String st=new String(c);
			
			if(!res.containsKey(st)) {
				res.put(st, new ArrayList<>());
			}
			res.get(st).add(s);
			
			
			
		}
		List<List<String>> res1=new ArrayList<>(res.values());
		System.out.print(res1);
	}

}
