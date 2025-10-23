package training;

public class Nestedclass {
	
	static class ngpeng{
		void cse() {
			System.out.println("nested class");
		}
	}
	void ece() {
		System.out.println("class");
	}

	public static void main(String[] args) {
		Nestedclass.ngpeng sc=new Nestedclass.ngpeng();
		sc.cse();
		
	}

}
