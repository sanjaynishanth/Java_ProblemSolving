package string;
import java.util.*;

public class StringUpperCase {

	public static void main(String[] args) {
		String s="hello world i am";
		char[] arr=s.toCharArray();
		System.out.print(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]==' ') {
				System.out.print(Character.toUpperCase(arr[i]));
			}else if(arr[i]!=' ') {
				System.out.print(arr[i]);
			}
		}
		
		
		
		
//		System.out.print(arr[0]);
//		for(int i=1;i<arr.length;i++) {
//			char[] res=arr[i].toCharArray();
//			
//			for(int j=0;j<res.length;j++) {
//				if(j==0) {
//					System.out.print(Character.toUpperCase(res[j]));
//					
//				}else {
//					System.out.print(res[j]);
//				}
//			}
//		}

	}

}
