package DSA;

class Stak{
	
	int capacity=5;
	int top=-1;
	int arr[]=new int[capacity];
	
	
	void push(int data) {
		if(top<capacity-1) {
			arr[++top]=data;
			System.out.print(data+" pushed " );
			return;
		}
		System.out.println("over flow");
		
	}
	int pop() {
		if(top==-1) {
			return Integer.MIN_VALUE;
		}
		return arr[top--];
	}
	

	
}

public class StackArray {

	public static void main(String[] args) {
		Stak ss=new Stak();
		ss.push(2);
		ss.push(1);
		ss.push(6);
		ss.push(8);
		ss.push(5);
		ss.push(4);
		ss.pop();
		ss.pop();
		ss.pop();
		
		if(ss.pop()==Integer.MIN_VALUE) {
			System.out.println("under flow");
		}
		else {
			System.out.println(ss.pop());
			ss.top--;
		}
		
	}

}
