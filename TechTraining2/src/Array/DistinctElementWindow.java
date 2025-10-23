package Array;
import java.util.*;

public class DistinctElementWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++) {
			int size=sc.nextInt();
			int k=sc.nextInt();
			int arr[]=new int[size];
			for(int j=0;j<size;j++) {
				arr[j]=sc.nextInt();
			}
			for(int m=0;m<size;m++) {
				Set<Integer>st=new HashSet<>();
				int sum=0;
				int end=m+k;
				if(end<=size) {
					for(int n=m;n<end;n++) {
						st.add(arr[n]);
					}
				}
				for(int res:st) {
					System.out.print(res+" ");
				}
				
			}
			System.out.println();
		}

	}

}
