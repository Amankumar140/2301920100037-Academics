class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        // O(n^2) approach
        // for(int i=1; i<=n; i++){
        // int leftSum=0;
        // for(int j=0; j<i-1; j++){
        // leftSum+=nums[j];
        // }
        // if(leftSum==(sum-leftSum-nums[i-1])){
        // return i-1;
        // }
        // }

        // O(n) approach
        int leftSum = 0;
        int rSum = 0;
        int i = 0, e = n - 1;
        for (int k = 0; k < n; k++) {
            if (leftSum == sum - nums[k] - leftSum) {
                return k;
            }
            leftSum += nums[i++];
        }
        return -1;
    }
}
