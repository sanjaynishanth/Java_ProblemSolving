package collection;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class PQueue {

	public static void main(String[] args) {
		LinkedList<Integer> li=new LinkedList<>();
		PriorityQueue<Integer> st=new PriorityQueue<>(li);
		st.add(5);
		st.add(6);
		st.add(54);
		st.add(8);
		System.out.println(st.poll());
		System.out.println(st.poll());
		System.out.println(st.poll());
		System.out.println(st.poll());
		System.out.println(st);

	}

}
