class Solution {
    public boolean hasDuplicate(int[] nums) {

        // actually simple sorting will be good)
        // did not know that hash set doesnt allow duplicates

        Arrays.sort(nums);

        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]== nums[i+1])
            return true;
           // i++;
        }
        return false;   

    }
}
