package Array;
import java.util.*;

import java.util.Arrays;

public class RearrangeAlternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,7};
		Arrays.sort(arr);
		int res[]=new int[arr.length];
		int pos=0;
		int i=0;
		int j=arr.length-1;
		List<Integer>li=new ArrayList<>();
		while(i<=j) {
			if(pos==0 || pos%2==0) {
				li.add(arr[j]);
				j--;
			}
			else {
				li.add(arr[i]);
				i++;
			}
			
			pos++;
		}
		System.out.print(li);

	}

}
