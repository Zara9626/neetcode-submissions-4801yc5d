class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMax = 0; 
        int currMin = 0;
        int total = 0 ; 
        int globalMin = nums[0];
        int globalMax = nums[0];

        for(int i = 0 ;i < nums.length; i++) { 
            currMax = Math.max (currMax + nums[i] , nums[i]); 
            globalMax = Math.max(globalMax, currMax); 
            currMin = Math.min(currMin + nums[i] , nums[i]); 
            globalMin = Math.min(globalMin, currMin);
            total += nums[i];
        }
        if (globalMax > 0) { 
            return Math.max(globalMax, total - globalMin);
        }
        return globalMax;
        
    }
}