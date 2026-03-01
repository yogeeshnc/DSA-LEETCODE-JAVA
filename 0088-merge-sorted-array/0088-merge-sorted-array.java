class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=0;
       int j=0;
       for (int k=0;k<m;k++){
        if (n==0){
            return;
        }
        if (nums1[i]<=nums2[0] ){
            i++;
        }
        else{
            int temp=nums1[i];
            nums1[i]=nums2[0];
            nums2[0]=temp;
            i++;
            }
        
        

       }
       for(int a=0;a<n;a++){
            nums1[i]=nums2[j];
            i++;
            j++;
        }
       

    }
}