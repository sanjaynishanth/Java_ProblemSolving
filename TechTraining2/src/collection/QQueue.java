package collection;
import java.util.*;

public class QQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		Queue <String>qi=new LinkedList();
		
		for(int i=1;i<=n;i++) {
			String s=sc.nextLine();
			String arr[]=s.split(" ");
			if(arr[0].equals("enqueue") ||arr.length==1 && !arr[0].equals("dequeue")) {
				qi.add(arr[arr.length-1]);
			}else if(arr[0].equals("dequeue")) {
				qi.poll();
			}
		}
		
		for(String s:qi) {
			System.out.println(s);
		}
		
		
		
		
		
//		
	}

}
