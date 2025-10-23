package techAlgorithms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		int arr[]= {1,3,4,4,4,5,7,3,5};
		
		HashMap <Integer,Integer> freq=new HashMap<>();
		
		for(int i:arr) {
			freq.put(i,freq.getOrDefault(i,0)+1);
		}
		
		Set<Integer>set=new HashSet<>(freq.values());
		List<Integer>val=new ArrayList<>(set);
		Collections.sort(val);
		
		int min=val.get(0);
		int max=val.get(val.size()-1);
		int sec=val.get(val.size()-2);
		int minval=0;
		int maxval=0;
		int seclar=0;
		
		for(Map.Entry<Integer, Integer> num: freq.entrySet()) {
			if(num.getValue()==min) {
				minval=num.getKey();
				break;
			}
			
		}
		for(Map.Entry<Integer, Integer> num: freq.entrySet()) {
			if(num.getValue()==max) {
				maxval=num.getKey();
				break;
			}
			
		}
		for(Map.Entry<Integer, Integer> num: freq.entrySet()) {
			if(num.getValue()==sec) {
				seclar=num.getKey();
				break;
			}
		}
		
		System.out.println(freq);
		System.out.println("minval " + minval);
		System.out.println("maxval " + maxval);
		System.out.println("seclar "+ seclar);
		
	}

}
