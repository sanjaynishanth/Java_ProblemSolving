package training;
import java.util.*;
public class ObjectcreationArray {
	int roll;
	String name;
	ObjectcreationArray(int roll,String name){
		this.name=name;
		this.roll=roll;
	}
	void disp() {
		System.out.println(name+" "+roll);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ObjectcreationArray []n=new ObjectcreationArray[2];
		for(int i=0;i<2;i++) {
			System.out.println("enter roll "+i);
			int r=sc.nextInt();
			System.out.println("enter name "+i);
			sc.nextLine();
			String s=sc.nextLine();
			n[i]=new ObjectcreationArray(r,s);
			
		}
		for(int i=0;i<2;i++) {
			n[i].disp();
		}

	}

}
