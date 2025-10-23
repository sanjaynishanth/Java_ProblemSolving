package training;

import java.util.ArrayList;
import java.util.Collections;

public class demo4 {

	public static void main(String[] args) {
		int a[]= {1,22,32};
		int b[]= {5,26,37};
		ArrayList<Integer> li=new ArrayList<>();
		
		for(int i:a) {
			li.add(i);
		}
		
		for(int i:b) {
			li.add(i);
		}
		
		Collections.sort(li);
		
	
		System.out.println(li);

	}

}
