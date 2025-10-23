package DSA;

class Nodec{
	int data;
	Nodec next;
	Nodec(int data){
		this.data=data;
		this.next=null;
	}
}
class SinCircular{
	Nodec head=null;
	
	void inbegin(int data) {
		Nodec newnode = new Nodec(data);
		if(head==null) {
			head=newnode;
			head.next=newnode;
			return;
		}
		
		Nodec current=head;
		while(current.next!=head) {
			current=current.next;
		}
		current.next=newnode;
		newnode.next=head;
		head=newnode;
		return;
	}
	void atend(int data) {
		Nodec newnode=new Nodec(data);
		if(head==null) {
			head=newnode;
			head.next=newnode;
			return;
		}
		Nodec current=head;
		while(current.next !=head) {
			current=current.next;
		}
		current.next=newnode;
		newnode.next=head;
		return;
		
	}
	void before(int data,int key) {
		if (head == null) {
			System.out.println("LL is Empty");
			return;
		}
		if(head.data==key) {
			inbegin(data);
			return;
		}
		Nodec newnode=new Nodec(data);
		Nodec current=head;
		while(current.next != head && current.next.data !=key ) {
			current=current.next;
		}
		if(current.next.data==key) {
			newnode.next=current.next;
			current.next=newnode;
			newnode=head;
			return;
		}
	}
	void after(int data,int key) {
		if (head == null) {
			System.out.println("LL is Empty");
			return;
		}
		Nodec newnode=new Nodec(data);
		Nodec current=head;
		while(current.next != head && current.data !=key ) {
			current=current.next;
		}
		
		if(current.data==key) {
			newnode.next=current.next;
			current.next=newnode;
			newnode=head;
			return;
		}
	}
	void delete(int key) {
		if(head==null) {
			System.out.println("sc is empty");
		}
		Nodec current=head;
		if(head.data==key) {
			if(head.next==head) {
				head=null;
				return;
			}
			while(current.next!=head) {
				current=current.next;
			}
			current.next = head.next;
			head=head.next;
			return;
		}
		while(current.next !=head &&current.next.data !=key) {
			current=current.next;
		}
		if(current.next!=head && current.next.data ==key) {
			current.next=current.next.next;
			return;
		}
		System.out.println("key is not the list");
	}
	void sort() {
		for(Node current=head;current!=null;current=current.next) {
			Node minNode=current;
			for(Node temp=current.next;temp!=null;temp=temp.next) {
				if(current.data>temp.data) {
					minNode=temp;
					int tempData=current.data;
					current.data=temp.data;
					temp.data=tempData;
					
				}
			}
			
		}
	}
	
	void print() {
		if(head==null) {
			System.out.println("sc is empty");
			return;
		}
		Nodec current = head;
		while (current.next != head) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println(current.data);
	}
}


public class SinglyCircular {
	public static void main(String[] args) {
		SinCircular slc = new SinCircular();
		slc.inbegin(1);
		slc.inbegin(2);
		slc.inbegin(3);
//		slc.after(8, 1);
//		slc.before(9, 1);
//		slc.atend(5);
//		slc.inbegin(0);
//		slc.delete(5);

		slc.print();

	}

}
