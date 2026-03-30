class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for( String temp : strs) { 
            char [] newArr = temp.toCharArray();
            Arrays.sort(newArr);
            String sorted = new String(newArr);

            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(temp);
        }
        return new ArrayList<>(map.values());



        
    }
}
