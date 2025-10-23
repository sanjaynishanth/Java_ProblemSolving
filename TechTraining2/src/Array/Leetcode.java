package Array;
public class Leetcode {

	public static void main(String[] args) {
		int height[]= {1,8,6,2,5,4,8,3,7};
		int max=0;
        int len=height.length;
        int i=0;
        int j=len-1;
        while(i<j){
            int width=j-i;
            int height1=Math.min(height[i],height[j]);
            int volume=width*height1;
            if(max<volume){
                max=volume;
            }
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println(max);
		
	}

}