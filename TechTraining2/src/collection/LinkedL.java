package collection;
import java.util.LinkedList;
public class LinkedL {

	public static void main(String[] args) {
		LinkedList <Integer> li=new LinkedList<>();
		
		//for vector
		//Vector <String> li=new Vector<>();
		
		li.addFirst(10);
		li.addFirst(20);
		li.addFirst(30);
		li.addFirst(40);
		li.addFirst(50);
		
		li.add(60);
		li.addLast(10);
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		System.out.println(li.reversed());
//		for(int i:li) {
//			System.out.print(i+" ");
//		}
		

	}

}
