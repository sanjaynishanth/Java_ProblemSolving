package string;
import java.util.*;

public class NumberToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		String result="";
		
		 String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		 String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen","sixteen", "seventeen", "eighteen", "nineteen"};
		 String[] tens = {"", "", "twenty", "thirty", "forty", "fifty","sixty", "seventy", "eighty", "ninety"};
		 
		 if(n>=1000) {
			 int th=n/1000;
			 result+=ones[th]+"thousand";
			 n%=1000;
			 if(n!=0) {
				 result+=" ";
			 }
		 }
		 
		 if(n>100) {
			 int hun=n/100;
			 result+=ones[hun]+" hundred and";
			 n%=100;
			 if(n!=0) {
				 result+=" ";
			 }
		 }
		 
		 if(n>=20) {
			 int ten=n/10;
			 result+=tens[ten];
			 n%=10;
			 
			 if(n!=0) {
				 result+=" "+ones[n];
			 }
		 }else if(n>=10) {
			 result+=teens[n-10];
			 
		 }else if(n>0) {
			 
			 result+=ones[n];
		 }
		 
		 
		 System.out.print(result);


	}
	
	
}
