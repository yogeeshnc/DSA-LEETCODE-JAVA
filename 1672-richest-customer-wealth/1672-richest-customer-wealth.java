class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth=0;
        int sum=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            if(sum>maxwealth){
                maxwealth=sum;
            }
            sum=0;

        }
        return maxwealth;
        
    }
}