class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left  = 0 ; 
        int total = 0 ; 

        int len = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right ++) { 
            total += nums[right];
            while ( total >= target) { 
                len = Math.min(right - left + 1, len);
                total -= nums[left];
                left ++;
            }
        }
        if(len == Integer.MAX_VALUE) { 
            return 0 ;
        }
        return len;
        
    }
}