package Array;
import java.util.*;

public class FreqElementWithCollectionm1 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,3,2};
		Set<Integer>st=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			st.add(arr[i]);
		}
		
		for(int i:st) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					count++;
				}
			}
			System.out.println(i+" "+count);
		}
	}

}
