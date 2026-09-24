class Solution {
    public void moveZeroes(int[] nums) {
        int ct=0;
        for(int i: nums){
            if(i!=0){
                nums[ct]=i;
                ct++;
            }
        }
        for(int i=ct;i<nums.length;i++){
            nums[i]=0;
        }
       
        
    }
}
