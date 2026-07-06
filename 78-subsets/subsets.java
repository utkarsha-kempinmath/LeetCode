class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        return sub(nums, ans, 0, current);
    }

    public static List<List<Integer>> sub(int[] nums, List<List<Integer>> ans, int i, List<Integer> current) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(current));
            return ans;
        }
        current.add(nums[i]);
        sub(nums, ans, i + 1, current);
        current.remove(current.size() - 1);
        sub(nums, ans, i + 1, current);
        return ans;
    }
}