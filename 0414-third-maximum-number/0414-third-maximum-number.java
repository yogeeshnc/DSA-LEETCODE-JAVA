class Solution {
    public int thirdMax(int[] nums) {
        long first_max = Long.MIN_VALUE;
        long sec_max = Long.MIN_VALUE;
        long third_max = Long.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>first_max){
                third_max = sec_max;
                sec_max = first_max;
                first_max = nums[i];
            }
            else if(nums[i] <first_max && nums[i] >sec_max){
                third_max = sec_max;
                sec_max = nums[i];
            }
            else if(nums[i] <sec_max && nums[i] >third_max){
                third_max = nums[i];
            }
            else{
                continue;
            }

        }
        if (third_max == Long.MIN_VALUE) {
            return (int) first_max;
        }
        
        return (int) third_max;
            
    }
}