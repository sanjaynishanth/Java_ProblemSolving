package collection;
import java.util.Stack;
public class StackS {

	public static void main(String[] args) {
		Stack <Integer> li=new Stack<>();
		
		li.push(50);
		li.push(40);
		li.push(30);
		li.push(20);
		li.push(10);
		li.pop();
		
		
		
		for(int i:li) {
			System.out.print(i+" ");
		}
		

	}

}
