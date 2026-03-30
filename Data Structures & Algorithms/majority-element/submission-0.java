class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int res = 0 ;
        int count = 0 ; 

        for(int i : nums) { 
            map.put(i, map.getOrDefault(i, 0) + 1);
            if(map.get(i) > count) { 
                res = i;
                count = map.get(i);
            }
        }
        return res;
        
    }
}