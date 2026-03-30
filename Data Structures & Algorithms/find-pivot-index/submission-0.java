class Solution {
    public int pivotIndex(int[] nums) {

        int total = 0 ; 
        for(int num : nums) { 
            total+= num;
        }

        int leftSum = 0;
        for(int t = 0 ; t < nums.length;t++) { 
            int rightSum = total - leftSum - nums[t];
            if(leftSum == rightSum) { 
                return t;
            }
            leftSum +=nums[t];
        }
        return -1;
        
    }
}