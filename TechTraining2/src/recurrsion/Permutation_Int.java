package recurrsion;
import java.util.*;


public class Permutation_Int {
	
	public static void combination(String s,String res,List<Integer>li) {
		if(s.length()==0) {
			li.add(Integer.parseInt(res));
			return;
		}
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			String rem=s.substring(0,i)+ s.substring(i+1);
			
			combination(rem,res+c,li);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="459";
		int tar=500;
		List<Integer>li=new ArrayList<>();
		
		combination(s,"",li);
		System.out.print(li);
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<li.size();i++) {
			
			int val=li.get(i);
			
			if(val >tar) {
				if(val<min) {
					min=val;
				}
			}
		}
		System.out.print(min);
		
		

	}

}
