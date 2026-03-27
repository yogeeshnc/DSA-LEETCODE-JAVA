class Solution {
    public int majorityElement(int[] nums) {
        float range=nums.length/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num: nums){
            
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
            if(map.get(num)>range){
                return num;
            }
           }
           
      return 0;  
    }
}