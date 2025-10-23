package Array;
import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		int arr[]= {1,5,4,9,8,7};
		int tar=15;
		
		HashMap<Integer,Integer> res=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int com=tar-arr[i];
			if(res.containsKey(com)) {
				System.out.println(res.get(com)+" "+i);
				return;
			}
			
			
			res.put(arr[i],i);
		}
		

	}

}
