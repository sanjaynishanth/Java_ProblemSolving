package Array;
import java.util.*;

public class HashmapOperations {

	public static void main(String[] args) {
		int arr[]= {1,3,4,4,4,5,7,3,5};
		
		HashMap <Integer,Integer> freq=new HashMap<>();
		
		for(int i:arr) {
			freq.put(i,freq.getOrDefault(i,0)+1);
		}
		
		Set<Integer>setKeys=new HashSet<>(freq.keySet());
		System.out.println(setKeys);
		Set<Integer>setValues=new HashSet<>(freq.values());
		System.out.println(setValues);
		List<Integer>val=new ArrayList<>(setValues);
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
//		System.out.println("minval " + minval);
//		System.out.println("maxval " + maxval);
//		System.out.println("seclar "+ seclar);
//		
	}

}
