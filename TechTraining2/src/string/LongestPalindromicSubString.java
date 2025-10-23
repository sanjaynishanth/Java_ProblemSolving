package string;

public class LongestPalindromicSubString {

	public static void main(String[] args) {
		
		String s="abadcdddd";
		String res=" ";
		int max=0;
		
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<=s.length();j++) {
				String org=s.substring(i,j);
//				System.out.print(org+" ");
				String s1=org;
				StringBuilder sb=new StringBuilder(s1);
				String s2=sb.reverse().toString();
				
				if(s2.equals(org) && org.length()>max) {
					max=org.length();
					res=org;
				}
			}
		}
		System.out.print(res);

	}

}
