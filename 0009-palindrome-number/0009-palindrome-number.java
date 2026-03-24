class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (except 0) can't be palindromes
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        int rev = 0;
        while (x > rev) {         // Stop when we've processed half the digits
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        // Even digits: x == rev      (e.g. 1221 → x=12, rev=12)
        // Odd digits:  x == rev/10   (e.g. 12321 → x=12, rev=123)
        return x == rev || x == rev / 10;
    }
}