class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
        }
        int leftsum=0;
         
        for(int i=0; i<n; i++){
            
            if(leftsum==sum-nums[i]-leftsum){return i;}
            leftsum+=nums[i];
        }
        return -1;
    }
}
