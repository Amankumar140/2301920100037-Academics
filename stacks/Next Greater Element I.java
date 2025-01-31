class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int m = nums1.length;
        int[] res = new int[m];

        for (int i = 0; i < m; i++) {
            int index = -1;
            for (int j = 0; j < n; j++) {
                if (nums2[j] == nums1[i]) {
                    index = j;
                }
            }
            boolean found = false;
            for (int k = index; k < n; k++) {
                if (nums2[k] > nums1[i]) {
                    res[i] = nums2[k];
                    found = true;
                    break;
                }
            }
            if (!found) {
                res[i] = -1;
            }

        }
        return res;
    }
}
