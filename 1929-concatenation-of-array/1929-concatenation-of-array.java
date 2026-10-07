class Solution {
    public int[] getConcatenation(int[] nums) {
        int i=nums.length;
        int[] ans = new int[i*2];
        for (int j=0;j<nums.length;j++){
            ans[j]=nums[j];
            ans[j+i]=nums[j];
        }
      return ans;  
    }
}