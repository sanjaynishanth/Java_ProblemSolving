package Array;


class Solution {
    public int findDuplicate(int[] nums) {  
        int m=nums[0];
        int n=nums[0];

        do{
            m=nums[m];
            n=nums[nums[n]];
        }while(m!=n);

        m=nums[0];
        while(m!=n){
            m=nums[m];
            n=nums[n];
        }
        return m;
    }
}

public class FloydsAlgorithm {

	public static void main(String[] args) {
		int arr[]={1,2,4,4,3};
        Solution sol=new Solution();
        int n1=sol.findDuplicate(arr);
        System.out.print(n1);

	}

}
