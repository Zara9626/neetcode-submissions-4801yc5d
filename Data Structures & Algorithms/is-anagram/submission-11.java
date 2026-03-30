class Solution {
    public boolean isAnagram(String s, String t) {


        // come back 
        // sorting could be sone with the characters

        if(s.length()!= t.length()){
            return false;
        }

        char[] ssort = s.toCharArray();
        char[] tsort = t.toCharArray();

        Arrays.sort(ssort);
        Arrays.sort(tsort);

        return Arrays.equals(ssort, tsort);
 
    }
}
