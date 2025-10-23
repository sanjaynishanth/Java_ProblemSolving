package DSA;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class SingleLink {
	Node head = null;

	void inbegin(int data) {
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
	}

	void atend(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newnode;
		return;
	}

	void after(int data, int key) {
		if (head == null) {
			System.out.println("LL is Empty");
			return;
		}
		Node newnode = new Node(data);
		Node current = head;
		while (current.next != null && current.data != key) {
			current = current.next;
		}
		if (current.data == key) {
			newnode.next = current.next;
			current.next = newnode;
			return;
		}
		System.out.println("Key value is not found");
	}

	void before(int data, int key) {
		if (head == null) {
			System.out.println("LL is empty");
			return;
		}
		if (head.data == key) {
			inbegin(data);
		}
		Node newnode = new Node(data);
		Node current = head;
		while (current.next.next != null && current.next.data != key) {
			current = current.next;
		}
		if (current.next.data == key) {
			newnode.next = current.next;
			current.next = newnode;
			return;
		}
		System.out.println("Key not found");
	}
	void insPos(int data,int pos) {
		if(head==null) {
			System.out.println("ll is empty");
			return;
		}
		
		Node current=head;
		if(pos==1) {
			inbegin(data);
			return;
		}
		while(current.next!=null && pos>2) {
			current=current.next;
			pos--;
		}
		if(pos==2) {
			Node newNode=new Node(data);
			newNode.next=current.next;
			current.next=newNode;
			return;
		}
	}

	void delvalue(int key) {
		if (head == null) {
			System.out.println("ll is empty");
			return;
		}
		

		if (head.data == key) {
			head = head.next;
			return;
		}
		

		Node current = head;
		if(head.data==key&&current.next==null) {
			head=null;
		}
		while (current.next != null && current.next.data != key) {
			current = current.next;
		}
		if (current.next != null && current.next.data == key) {
			current.next = current.next.next;
			System.out.println("Deleted " + key + " from ll successfully");
			return;
		}
		System.out.println("searched key is not in the ll");
	}

	void delcount(int pos) {
		if (head == null) {
			System.out.println("LL is empty");
		}
		if (pos == 1) {
			head = head.next;
			return;
		}
		Node current = head;
		while (current.next != null && pos > 2) {
			current = current.next;
			pos--;
		}
		if (current.next != null) {
			current.next = current.next.next;
			System.out.println("deleted successfully");
			return;
		}
		System.out.println("posistion out of LL");
	}

	void search(int key) {
		int index = 1;
		if (head == null) {
			System.out.println("LL is empty");
			return;
		}
		Node current = head;
		while (current.next != null && current.data != key) {
			current = current.next;
			index++;
		}
		if (current.data == key) {
			System.out.println(key + " is present in the position " + index);
			return;
		}
		System.out.println("element is not found");
	}
	void sort() {
		for(Node current=head;current!=null;current=current.next) {
			//Node minNode=current;
			for(Node temp=current.next;temp!=null;temp=temp.next) {
				if(current.data>temp.data) {
					//minNode=temp;
					int tempData=current.data;
					current.data=temp.data;
					temp.data=tempData;
					
				}
			}
			
		}
	}

	void print() {
		if (head == null) {
			System.out.println("LL is empty");
			return;
		}
		Node current = head;
		while (current.next != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println(current.data);
	}
}

public class SinglyLinkedList {
	public static void main(String[] args) {
		SingleLink sll = new SingleLink();
		sll.inbegin(1);
		sll.inbegin(7);
		sll.inbegin(5);
		sll.inbegin(4);
//		sll.atend(4);
//		sll.after(3, 1);
//		sll.before(2, 3);
//		sll.atend(1);
//		sll.atend(6);
//		sll.atend(5);
//		sll.insPos(8,3);
//		sll.delcount(2);
//		sll.delvalue(1);
//		sll.search(4);
		sll.sort();
		sll.print();
	}
}