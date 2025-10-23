package Array;
import java.util.*;


public class Smallestwindow {

	public static void main(String[] args) {
		String s="Supercalifragilisticexpialidocious";
		String s2="expect";
		HashMap<Character,Integer>subfreq=new HashMap<>();
		for(char c:s2.toCharArray()) {
			subfreq.put(c,subfreq.getOrDefault(c,0)+1);
		}
		
		String res="";
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				String check=s.substring(i,j);
				
				HashMap<Character,Integer>freq=new HashMap<>();
				for(char c:check.toCharArray()) {
					freq.put(c,freq.getOrDefault(c,0)+1);
				}
				
				boolean valid=true;
				for(char key:subfreq.keySet()) {
					if(freq.getOrDefault(key,0)<subfreq.get(key)) {
						valid=false;
						break;
					}
				}
				
				
				if(valid) {
					if(check.length()<min) {
						min=check.length();
						res=check;
					}
				}
			}
		}
		System.out.print(res.equals("") ? "-1":res);
		
		
	}

}
