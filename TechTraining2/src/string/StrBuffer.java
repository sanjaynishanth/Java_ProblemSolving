package string;

public class StrBuffer {

	public static void main(String[] args) {
		String str="java is a good";
		StringBuffer str1=new StringBuffer(str);
		System.out.println(str1.capacity());//string capacity
		System.out.println(str);
		str1.append(" programming language");//appending string
		System.out.println(str1);
		
		System.out.println(str1.reverse());//reverse the string using string buffer
	
		//System.out.println(str1.codePointCount(0, 15));
		

	}

}
