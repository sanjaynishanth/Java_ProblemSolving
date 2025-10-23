package Array;
import java.util.*;

import java.util.Arrays;

public class Merging_Array_Intervals {

	public static void main(String[] args) {
		
		int arr[][]= {{1,3},{2,6},{8,10},{15,18},{17,20}};
			
		
		Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
		
		List<int[]> li=new ArrayList<>();
		int start=arr[0][0];
		int end=arr[0][1];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i][0]<=end ) {
				end=Math.max(end,arr[i][1]);
			}else {
				li.add(new int[]{start,end});
				start=arr[i][0];
				end=arr[i][1];
				
			}
				
		}
		li.add(new int[] {start,end});
		
		for(int [] i:li) {
			System.out.println(i[0]+" "+i[1]);
		}
		

	}

}
