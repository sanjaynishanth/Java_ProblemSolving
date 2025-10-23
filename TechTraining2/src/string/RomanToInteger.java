package string;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		HashMap<Character,Integer> val=new HashMap<>();

		val.put('I',1);
		val.put('V',5);
		val.put('X',10);
		val.put('L',50);
		val.put('C',100);
		val.put('D',500);
		val.put('M',1000);
		int res=0;
		for(int i=0;i<s.length();i++){
			int curr=val.get(s.charAt(i));
			if(i+1<s.length()){
				int n=val.get(s.charAt(i+1));
				if(curr<n){
					res -= curr;
				}else{
					res+=curr;
				}
				
			}else {
				res+=curr;
			}
		}
		System.out.print(res);
	}

}
