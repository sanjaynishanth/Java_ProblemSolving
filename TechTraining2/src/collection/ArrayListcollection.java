package collection;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListcollection {

	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();//after java 8
		//List<Integer> li=new ArrayList<>(); arraylist extends from list 
		//List<Integer> li=new ArrayList<Integer>();before java 8
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(50);
		li.add(40);
		li.set(0, 70);
		int a=li.get(0);
		System.out.println(a);
		System.out.println(li);
		
		System.out.println(li.contains(90));
	   //1st way iterate
		for(int i:li) {
			System.out.print(i+" ");
		}
		System.out.println();
		//2nd way
		Iterator<Integer> it=li.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		int sum=0;
		while(it.hasNext()) {
			sum=sum+it.next();
		}
		System.out.println(sum);
		
		

	}

}
