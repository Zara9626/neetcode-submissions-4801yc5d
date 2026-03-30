class Solution {
    public int removeDuplicates(int[] nums) {

        int len = nums.length;
        int left = 0 ; 
        int right = 0 ; 

        while(right < len) { 
            nums[left] = nums[right];
            while(right < len && nums[right] == nums[left]) { 
                right ++;
            }
            left ++;
        }
        return left;
        
    }
}