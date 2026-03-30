class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        // for each loop for the words
        // convert words to characters
        // sort the each string characters
        // create a new string in order to put it in the map 

        for(String words: strs){

            char [] newArr = words.toCharArray();
            Arrays.sort(newArr);
            String sorted = new String(newArr);

            // puts in to the map if value does not exists
            // creates a new arraylist 
            // at the end print all values

            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(words);

        }
        return new ArrayList<>(map.values());

        

      


    }
}
