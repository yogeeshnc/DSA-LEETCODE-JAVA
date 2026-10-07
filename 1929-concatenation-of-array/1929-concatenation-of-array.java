class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result= new int[2*nums.length];
        int count=0;
        for(int i=0;i<2*nums.length;i++){
            if(count==nums.length){
                count=0;
            }
            result[i]=nums[count];
            count++;

        }
        return result;
        
    }
}