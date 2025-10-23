package Array;
import java.util.*;

public class FourSum {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};
		int tar=12;
		Arrays.sort(arr);
		int count=0;
		List<List<Integer>> res=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int left=j+1;
				int right=arr.length-1;
				
				while(left<right) {
					int val=arr[i]+arr[j]+arr[left]+arr[right];
					if(val==tar) {
						List<Integer>li=Arrays.asList(arr[i],arr[j],arr[left],arr[right]);
						if(!res.contains(li)) {
							res.add(li);
						}
						count++;
						left++;
						right--;
					}
					else if(val<tar) {
						left++;
					}else {
						right--;
					}
				}
				
			}
//			res.add(li);
		}
		System.out.println(count);
		
		System.out.println(res);
		
		

	}

}
