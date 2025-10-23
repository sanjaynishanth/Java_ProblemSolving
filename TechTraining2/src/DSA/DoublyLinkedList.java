package DSA;

class Nodedl {
	int data;
	Nodedl next;
	Nodedl prev;

	Nodedl(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;

	}
}

class Doublyll{
	Nodedl head;
	void inbegin(int data) {
		Nodedl newnode=new Nodedl(data);
		if(head !=null) {
			head.prev=newnode;
			newnode.next=head;
		}
		head=newnode;
	}
	
	void end(int data) {
		if(head==null) {
			inbegin(data);
		}
		Nodedl newnode=new Nodedl(data);
		Nodedl current=head;
		while(current.next !=null) {
			current=current.next;
		
		}
		newnode.prev=current;
		current.next=newnode;
		
		return;
	}
	
	void after(int data,int key) {
		if(head==null) {
			System.out.println("dl is empty");
		}
	}
	void print() {
		Nodedl current=head;
		if(head==null) {
			System.out.println("dl is empty");
			return;
		}
		while(current.next !=null) {
			System.out.print(current.data+"--->");
			current=current.next;
		}
		System.out.print(current.data);
	}
}


public class DoublyLinkedList {

	public static void main(String[] args) {
		Doublyll dll=new Doublyll();
		dll.inbegin(4);
		dll.inbegin(5);
		dll.end(8);
		
		dll.print();

	}

}
