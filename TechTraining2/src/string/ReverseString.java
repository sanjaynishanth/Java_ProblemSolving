package string;

public class ReverseString {

	public static void main(String[] args) {
		String str1="java is a good programming language";
		StringBuffer sb=new StringBuffer(str1);
		
		String str3=sb.reverse().toString();
		
		String str2[]=str3.split(" ");
		for(int i=str2.length-1;i>0;i--) {
			System.out.print(str2[i]+" ");
		}
	}

}
