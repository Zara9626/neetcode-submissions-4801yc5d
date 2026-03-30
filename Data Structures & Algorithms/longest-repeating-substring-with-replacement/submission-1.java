class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0 ;
        int right = 0 ; 
        int maxFreq = 0;
        int len = 0 ;
        
        HashMap<Character, Integer> map = new HashMap <>();

        for (right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            map.put(current, map.getOrDefault(current , 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(current));
            
            if((right - left + 1) - maxFreq > k ) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            len = Math.max(len, right - left + 1);

        }
        return len;

        
    }
}
