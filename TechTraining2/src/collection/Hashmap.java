package collection;
import java.util.HashMap;
import java.util.Map;
public class Hashmap {

	public static void main(String[] args) {
		String s="mathsmm";
		HashMap<Character,Integer> map=new HashMap<>();
		for(char ch:s.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println(map.entrySet());

	}

}
