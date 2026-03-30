class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word : strs) { 
            char [] newArray = word.toCharArray();
            Arrays.sort(newArray);
            String newWord = new String(newArray);

            map.putIfAbsent(newWord , new ArrayList<>());
            map.get(newWord).add(word);
        }
        return new ArrayList<>(map.values());
        
    }
}
