class Solution {
    public int lengthOfLongestSubstring(String s) {

        int count = 0;
        int i = 0;
        int j = 0;
        int len = s.length();

        HashMap<Character, Integer> hm = new HashMap<>();

        while (i <= j && j < len) {

            char ch = s.charAt(j);

           

            if (hm.containsKey(ch) && hm.get(ch)>=i) {
                i = hm.get(ch)+1;
            }
            
                hm.put(ch, j);
               count = Math.max(count, j - i + 1);

            j++;
        }

        return count;

    }
}