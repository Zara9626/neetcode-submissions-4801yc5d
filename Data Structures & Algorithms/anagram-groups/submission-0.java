class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String words: strs){

            char [] newArr = words.toCharArray();
            Arrays.sort(newArr);
            String sorted = new String(newArr);

            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(words);

        }
        return new ArrayList<>(map.values());

        

      


    }
}
