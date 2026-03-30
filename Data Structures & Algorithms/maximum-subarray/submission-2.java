class Solution {
    public int maxSubArray(int[] nums) {
        int num = nums[0];
        int cursum = 0;

        for(int n : nums){
            cursum = n+ Math.max(cursum, 0); // math.max return the greates from two numbers;
            num = Math.max(num,cursum);
        }
        return num;






      
    }
}
