class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        backtrack(nums, 0, curr, res);

        return res;
    }
    private void backtrack(int[] nums, int index, List<Integer> curr, List<List<Integer>> res) {
        if (index == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        // skip the firts element in arr
        backtrack(nums, index + 1, curr, res);

        // add the element in arr
        curr.add(nums[index]);
        backtrack(nums, index + 1, curr, res);

        // backtrack to prev element and remove that element
        curr.remove(curr.size() - 1);
    }
}
