package stars;
import java.util.*;

public class NeoColabPatterns {

	public static void main(String[]args){
	     Scanner sc=new Scanner(System.in);
	     String s="ABCDefghijk";
	     int n=3;
	     
	     int l=s.length();
	     int s1=0;
	     
	     
	     while(s1<l) {
	    	 for(int i=0;i<n && s1<l ;i++){
	             for(int j=0;j<=i;j++){
	                 if(j==i){
	                     System.out.print(s.charAt(s1));   
	                 }else{
	                     System.out.print("* ");
	                 }  
	             }
	             s1++;
	             System.out.println();
	         }
	         for(int i=n-1;i>1 && s1<l ;i--){
	             for(int j=1;j<=i;j++){
	                 if(j==i){
	                     System.out.print(s.charAt(s1));
	                     
	                 }else{
	                     System.out.print("* ");
	                 } 
	             }
	             s1++;
	             System.out.println();
	         }
	    	 
	     }
	         
	         
	     
	     
	 }

}

