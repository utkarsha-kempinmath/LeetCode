class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        return sub(nums, ans, current, 0);
    }
    public static List<List<Integer>> sub(int[] nums, List<List<Integer>> ans, List<Integer> current, int i){
        ans.add(new ArrayList<>(current)); 
        if(i==nums.length){
            return ans; 
        }
        for(int j = i; j < nums.length; j++){
            if(j > i && nums[j] == nums[j - 1]) continue;
            current.add(nums[j]);
            sub(nums, ans, current, j+1);
            current.remove(current.size() - 1);
        }
        return ans;
    } 
}