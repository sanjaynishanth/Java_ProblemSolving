package training;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		String s="ab1c";
		StringBuilder sc=new StringBuilder();
		
		
		String result="";
		
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)) {
            	if(sc.length()>0) {
            		sc.deleteCharAt(sc.length()-1);
            	}
            }else {
            	result+=c;
            	System.out.println(result);
            }
        }
        
        
		
	}

}
				