class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1] && temp != nums[i]){
                nums[k] = nums[i];
                k++;
                temp = nums[i];
            }
        }
        return k;
    }
}