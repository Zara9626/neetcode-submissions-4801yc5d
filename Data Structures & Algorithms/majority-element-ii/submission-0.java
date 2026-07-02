class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        int tarCount = len / 3;
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();

        if (len == 1) {
            res.add(nums[0]);
            return res;
        }

        int freq = 1;
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                freq++;
            } else {
                freq = 1;
            }
            
            if (freq > tarCount && (i == len - 1 || nums[i] != nums[i+1])) {
                res.add(nums[i]);
            }
        }
        return res;
    }
}