package training;
class Node11{
	int data;
	Node11 next;
	
	Node11(int data){
		this.data=data;
		this.next=null;
	}
}


class Sing{
	Node11 head=null;
	
	void begin(int data) {
		Node11 newnode =new Node11(data);
		newnode.next=head;
		head=newnode;
	}
	void end(int data) {
		Node11 newnode=new Node11(data);
		if(head==null) {
			begin(data);
		}
		
		Node11 current=head;
		while(current.next!=null) {
			current=current.next;
		}
		
		if(current.next==null) {
			current.next=newnode;
			
			return;
		}
	}
	
	
	
	void print() {
		if(head==null) {
			System.out.println("ll is null");
			return;
		}
		
		Node11 current=head;
		while(current.next !=null) {
			System.out.print(current.data+"--->");
			current=current.next;
		
		}
		System.out.println(current.data);
	}
}
public class Test {

	public static void main(String[] args) {
		Sing sl=new Sing();
		sl.begin(5);
		sl.begin(6);
		sl.end(8);
		sl.print();
		

	}

}
