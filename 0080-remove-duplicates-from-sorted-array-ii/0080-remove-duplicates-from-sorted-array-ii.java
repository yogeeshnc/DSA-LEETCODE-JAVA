class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int n = nums.length;
        int count = 1;

        if (n < 3)
            return n;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
                count = 1;
            } 
            else if (count < 2) {
                nums[j] = nums[i];
                j++;
                count++;
            } 
            else {
                count++;
            }
        }
        return j;
    }
}