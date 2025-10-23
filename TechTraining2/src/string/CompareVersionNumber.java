package string;
import java.util.*;


public class CompareVersionNumber {

	public static void main(String[] args) {
		String version1="1.01";
		String version2="1.001";
		
		String s1[]=version1.split("\\.");
		String s2[]=version2.split("\\.");

		int len1=s1.length;
		int len2=s2.length;

		int maxlen=Math.max(len1,len2);

		for(int i=0;i<maxlen;i++){
		    int num1=i<len1?Integer.parseInt(s1[i]):0;
		    int num2=i<len2?Integer.parseInt(s2[i]):0;

		    if(num1<num2){
		    	System.out.print(-1);
		        return;
		    }else if(num1>num2){
		    	System.out.print(1);
		        return;
		    }
		}
		System.out.print(0);
		return;
		
			

	}

}

//String s1="1.01";
//String s2= "1.001";
//
//
//
//char arr1[]=s1.toCharArray();
//int ind=0;
//for(int i=0;i<arr1.length;i++) {
//	if(arr1[i]=='.') {
//		ind=i;
//	}
//	
//}
//char arr2[]=s2.toCharArray();
//int ind1=0;
//
//for(int i=0;i<arr2.length;i++) {
//	if(arr2[i]=='.') {
//		ind1=i;
//	}
//}
//int val=Integer.parseInt(s1.substring(ind+1,s1.length()));
//int val1=Integer.parseInt(s2.substring(ind1+1,s2.length()));
//
//
//if(val>val1) {
//	System.out.print(1);
//}else if(val==val1) {
//	System.out.print(0);
//}else {
//	System.out.print(-1);
//}



