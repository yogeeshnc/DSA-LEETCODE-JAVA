class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        int n;
        for(int num :nums){
            n=0;
            while(num>0){
                n+=(num%10);
                num/=10;
            }
            min=Math.min(min,n);
            }


        
        return min;
    }
}
