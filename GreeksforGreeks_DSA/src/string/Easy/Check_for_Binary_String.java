package string.Easy;

import java.util.*;
public class Check_for_Binary_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
//		String s=sc.nextLine();
		String s="10101010";
		
		boolean flag=true;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='0' && s.charAt(i)!='1') {
				flag=false;
				break;
			}
		}
		System.out.println(flag);

	}

}
