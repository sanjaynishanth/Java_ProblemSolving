package simulationProgram;
import java.util.*;
public class Slides_Snake {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		String players[]=new String[n];
		for(int i=0;i<players.length;i++) {
			players[i]=sc.nextLine();
		}
		String starter=sc.nextLine();
		
		int nodice=sc.nextInt();
		int val[]=new int[nodice];
		for(int i=0;i<nodice;i++) {
			val[i]=sc.nextInt();
		}
		
		Map<Integer,Integer> jump=new HashMap<>();
		jump.put(3,12);
//		jump.put(20,6);
		
		Map<Integer ,Integer>slides=new HashMap<>();
		slides.put(20, 6);
		
		
		int pos[]=new int[n];
		boolean[] start=new boolean[n];
		int ladderused[]=new int[n];
		int slidesused[]=new int[n];
		
		
		//find index of player
		int turn =-1;
		
		for(int i=0;i<n;i++) {
			if(players[i]==starter) {
				turn=i;
				break;
			}
		}
		
		String winner=null;
		
		for(int i=0;i<nodice;i++) {
			if(winner!=null) {
				break;
			}
			int roll=val[i];
			boolean extraturn=(roll==1 ||roll==5);
			if(!start[turn]) {
				if(roll==1) {
					start[turn]=true;
					int target=pos[turn]+1;
					if(target<=25) {
						pos[turn]=target;
					}
				}
				
			}
			else {
				int target=pos[turn]+roll;
				if(target<=25) {
					pos[turn]=target;
				}
				
				if(jump.containsKey(pos[turn])) {
					pos[turn]=jump.get(pos[turn]);
					ladderused[turn]++;
				}else if(slides.containsKey(pos[turn])) {
					pos[turn]=slides.get(pos[turn]);
					slidesused[turn]++;
				}
				for(int j=0;j<n;j++) {
					if(j!=turn && pos[j]==pos[turn] && pos[turn]!=0) {
						pos[j]=0;
						pos[turn]=0;
					}
				}
				
				if(pos[turn]==25) {
					winner=players[turn];
				}
			}
			if(winner==null && !extraturn) {
				turn=(turn+1)%n;
			}
		}
		
		for(int i=0;i<n;i++) {
			int rem=(pos[i]==0) ? 25 : (25- pos[i]);
			System.out.println(players[i]+"|"+pos[i]+"|"+rem+"|"+slidesused[i]+"|"+ladderused[i]);
		}
		if(winner!=null) {
			System.out.println(winner+" winner");
		}else {
			System.out.println("tie");
		}
		

	}

}
