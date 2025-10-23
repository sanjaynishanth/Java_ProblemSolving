package Array;
import java.util.*;


public class FreqElementWithCollectionm2 {

	public static void main(String[] args) {
		int arr[]= {1,2,4,1,5};
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int num:arr) {
			hm.put(num,hm.getOrDefault(num,0)+1);
		}
		System.out.println(hm);
		
		System.out.print(hm.get(1));
		
		
//		for(Map.Entry<Integer,Integer> res:hm.entrySet()) {
//			System.out.println(res.getKey()+" "+res.getValue());
//		}
	}
}
