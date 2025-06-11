package com.aparna.DSPractice.slidingwindow;

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int ans = 0;
        int left = 0;
        int curr = 1;
        
        for (int right = 0; right < nums.length; right++) {
            curr *= nums[right];
            while (curr >= k) {
                curr /= nums[left];
                left++;
            }

            ans += right - left + 1;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int [] arr = {10, 5, 2, 6};
        System.out.println(sol.numSubarrayProductLessThanK(arr,100));
    }
}