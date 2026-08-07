class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int right = 0;
        int len = 0;

        for (int left = 0; left < s.length(); left++) {
            while (set.contains(s.charAt(left))) {
                set.remove(s.charAt(right));
                right++;
            }
            set.add(s.charAt(left));
            len = Math.max(len, left - right + 1);
        }
        return len;
    }
}
