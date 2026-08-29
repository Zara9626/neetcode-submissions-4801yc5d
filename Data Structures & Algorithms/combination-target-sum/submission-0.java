class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(nums, target, 0, curr, res);
        return res;
    }

    private void backtrack(
        int[] nums, int rem, int start, List<Integer> curr, List<List<Integer>> res) {
        // base case
        if (rem == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        if (rem < 0) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            backtrack(nums, rem - nums[i], i, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}
