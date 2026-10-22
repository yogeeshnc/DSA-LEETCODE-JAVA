class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;

        int n = t.length();
        int m = s.length();

        while(i<n && j<m){
            if(s.charAt(j)==t.charAt(i)){
                j++;
            }
            i++;
        }

        return j==m;
    }
}