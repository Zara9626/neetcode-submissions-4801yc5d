class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3)
            return new ArrayList<>();

        Set<List<Integer>> list = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> res = Arrays.asList(nums[i], nums[j], nums[k]);
                        list.add(res);
                    }
                }
            }
        }

        return new ArrayList<>(list);
    }
}
