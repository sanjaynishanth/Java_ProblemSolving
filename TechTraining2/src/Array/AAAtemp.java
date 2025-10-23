package Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AAAtemp {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int size=sc.nextInt();
	        int arr[]=new int[size];
	        for(int i=0;i<size;i++){
	            arr[i]=sc.nextInt();
	           
	        }
	        
	        int n=sc.nextInt();
	        int fav[]=new int[n];
	        for(int i=0;i<n;i++){
	            fav[i]=sc.nextInt();
	        }
	        int i=0;
	        int j=0;
	        
	        boolean flag=false;
	        
	        while(i<n && j<size){
	            if(fav[i]==arr[j]){
	                
	                j++;
	                i++;
	                if(i==n) {
	                	flag=true;
	                }
	                // res[i]=true;
	            }else{
	                 j++;
	                 flag=false;
	            }
	        
	        }
	        
	        if(flag){
	             System.out.print("Yes");
	        }else{
	            System.out.print("No");
	        }
		
		    	
	}
	
	
}
