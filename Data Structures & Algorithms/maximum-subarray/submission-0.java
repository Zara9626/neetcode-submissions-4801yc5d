class Solution {
    public int maxSubArray(int[] nums) {
        int msum = nums[0];
        int cursum=0;

        for(int i : nums){
            cursum = Math.max(cursum,0); // Math.max gives the max numbers from two nums
            cursum+=i;
            msum = Math.max(msum,cursum);

        }
        return msum;
        
    }
}
