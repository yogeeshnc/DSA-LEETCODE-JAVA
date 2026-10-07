class Solution {
    public int[] runningSum(int[] nums) {
        int s=0;
        int[] out= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            out[i]=s+nums[i];
            s=out[i];
        }
        return out;
        
    }
}