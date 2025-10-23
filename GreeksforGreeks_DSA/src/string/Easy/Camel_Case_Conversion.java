package string.Easy;

public class Camel_Case_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="here comes the garden";
		
		System.out.print(s.charAt(0));
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i-1)==' ') {
				System.out.print(Character.toUpperCase(s.charAt(i)));
			}else if(s.charAt(i)!=' ') {
				System.out.print(s.charAt(i));
			}
		}

	}

}
