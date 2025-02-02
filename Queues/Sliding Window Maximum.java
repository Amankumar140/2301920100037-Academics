class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        // ArrayList <Integer> res=new ArrayList<>();
        // for(int i=0; i<n-k+1; i++){
        // int j=i;
        // int max=Integer.MIN_VALUE;
        // while(j<n && j<i+k){
        // max=Math.max(nums[j],max);
        // j++;
        // }
        // res.add(max);
        // }
        // int[] r = new int[res.size()];
        // for (int i = 0; i < res.size(); i++) {
        // r[i] = res.get(i);
        // }

        // return r;

        int[] res = new int[n - k + 1];

        Deque<Integer> d = new ArrayDeque<>();
        int ri = 0;
        for (int i = 0; i < n; i++) {
            if (!d.isEmpty() && d.peek() == i - k) {
                d.poll();
            }
            while (!d.isEmpty() && nums[d.peekLast()] < nums[i]) {
                d.pollLast();
            }
            d.offer(i);
            if (i >= k - 1) {
                res[ri++] = nums[d.peek()];
            }
        }
        return res;

    }
}
