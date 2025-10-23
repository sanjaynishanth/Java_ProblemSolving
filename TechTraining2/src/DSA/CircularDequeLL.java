package DSA;
class Nodeque{
	int data;
	Nodeque next;
	Nodeque(int data){
		this.data=data;
		this.next=null;
	}
}

class CircularQueLL{
	Nodeque front=null;
	Nodeque rear=null;
	
	boolean isempty() {
		
		return  front==null;
	}
	
	
	void enque(int data) {
		Nodeque newnode =new Nodeque(data);
		if(rear==null) {
			front=rear;
			rear=newnode;
			return;
		}else {
			rear.next=newnode;
			rear=newnode;
		}
		
	}
	void deque() {
		
		if(front==null) {
			System.out.println("ql is empty");
			return;
		}else {
			Nodeque temp=front;
			front=front.next;
		}
		
	}
	int getfront() {
		return front.data;
	}
}

public class CircularDequeLL {

	public static void main(String[] args) {
		CircularQueLL ql=new CircularQueLL();
		ql.enque(5);
		ql.enque(7);
		//ql.deque();
		ql.getfront();
		

	}

}
