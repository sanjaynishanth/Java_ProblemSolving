package Array;
import java.util.*;


public class AAAtemp2 {

	public static void main(String[] args) {
		String s="Supercalifragilisticexpialidocious";
		String s2="expect";
		HashMap<Character,Integer>subfreq=new HashMap<>();
		for(char c:s2.toCharArray()) {
			subfreq.put(c,subfreq.getOrDefault(c,0)+1);
		}
		String res="";
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				String check=s.substring(i,j);
				
				HashMap<Character,Integer>freq=new HashMap<>();
				for(char c:check.toCharArray()) {
					freq.put(c,freq.getOrDefault(c,0)+1);
				}
				
				boolean valid=true;
				for(char key:subfreq.keySet()) {
					if(freq.getOrDefault(key,0)<subfreq.get(key)) {
						valid=false;
						break;
					}
				}
				
				
				if(valid) {
					if(check.length()<min) {
						min=check.length();
						res=check;
					}
				}
			}
		}
		System.out.print(res.equals("") ? "-1":res);
		
		
	}

}


//Scanner sc=new Scanner(System.in);
//String s="Supercalifragilisticexpialidocious";
//		
//
//String p="expect";
//int count=p.length();
//List<Character>li=new ArrayList<>();
//for(int i=0;i<p.length();i++){
//    li.add(p.charAt(i));
//}
//
//String fi="";
//int min=Integer.MAX_VALUE;
//char []ch=s.toCharArray();
//
//for(int i=0;i<s.length();i++){
//	 
//    for(int j=i;j<=s.length();j++){
//        String res="";
//        res=s.substring(i,j);
//        
//        List<Character>st=new ArrayList<>();
//        for(int k=0;k<res.length();k++){
//            if(!st.contains(res.charAt(k))){
//                st.add(res.charAt(k));
//            }
//            
//        }
////        System.out.println(st);
//        int check=0;
//        
//        for(int k=0;k<li.size();k++){
//            if(st.contains(li.get(k))){
//                check++;
//            }
//        }
//        if(count==check){
//            if(res.length()<min){
//                min=res.length();
//                fi=res;
//            }
//        }
//    }
//}
//if(fi.length()==0){
//    System.out.print(-1);
//}else{
//    System.out.print(fi);
//}


