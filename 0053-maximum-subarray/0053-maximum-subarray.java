class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum     = nums[0];   // best sum found so far
    int currentSum = nums[0];   // best sum ending at current index

    for (int i = 1; i < nums.length; i++) {

        // DECISION POINT: extend or restart?
        currentSum = Math.max(nums[i], currentSum + nums[i]);

        // Update global best
        maxSum = Math.max(maxSum, currentSum);
    }

    return maxSum;
        
    }
}