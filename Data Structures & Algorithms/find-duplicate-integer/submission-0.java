class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int res = 0 ;

        for(int j = 0 ; j < nums.length; j++ ) { 
            if(set.contains(nums[j])) { 
                res = nums[j];
                return res;
            }else { 
                set.add(nums[j]);
            }
        }
        return res;

       



        
    }
}
