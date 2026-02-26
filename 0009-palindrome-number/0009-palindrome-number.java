class Solution {
    public boolean isPalindrome(int x) {
        int reminder,original;
long rev=0;
original=x;
while(x!=0){
   reminder=x%10;
   rev=rev*10+reminder;
   x=x/10; 
}
if(original<0)
return false;
else if(original==rev)
return true;
else
 return false;

        
    }
}