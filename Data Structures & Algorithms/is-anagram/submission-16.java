class Solution {
    public boolean isAnagram(String s, String t) {
        char [] s1 = s.toCharArray();
        char [] s2 = t.toCharArray();
        Arrays.sort(s2);
        Arrays.sort(s1);

        return Arrays.equals(s1, s2);


    }
}
