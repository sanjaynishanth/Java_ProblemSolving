package string;
import java.util.*;

public class NumberToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		String res="";
		
		 String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		 String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen","sixteen", "seventeen", "eighteen", "nineteen"};
		 String[] tens = {"", "", "twenty", "thirty", "forty", "fifty","sixty", "seventy", "eighty", "ninety"};
		 
		 if(n>=1000) {
			 int th=n/1000;
			 res+=ones[th]+"thousand";
			 n%=1000;
			 if(n!=0) {
				 res+=" ";
			 }
		 }
		 
		 if(n>100) {
			 int hun=n/100;
			 res+=ones[hun]+" hundred and";
			 n%=100;
			 if(n!=0) {
				 res+=" ";
			 }
		 }
		 
		 if(n>=20) {
			 int ten=n/10;
			 res+=tens[ten];
			 n%=10;
			 
			 if(n!=0) {
				 res+=" "+ones[n];
			 }
		 }else if(n>=10) {
			 res+=teens[n-10];
			 
		 }else if(n>0) {
			 res+=ones[n];
		 }
		 
		 
		 System.out.print(res);


	}
	
	
}
