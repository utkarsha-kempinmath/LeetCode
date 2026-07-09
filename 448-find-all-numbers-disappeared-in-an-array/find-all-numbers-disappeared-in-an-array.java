class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while(i < nums.length){
            int ind = nums[i] - 1;
            if (nums[i] != nums[ind]) {
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
            } else {
                i++;
            }
        }
        for(i = 0; i < nums.length; i++){
            if (nums[i] != i + 1) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
}