class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        int n = nums.length-1;
        while(i<nums.length){
            if(nums[i] == i+1){
                i++;
            }
            else{
                int ind = nums[i]-1;
                if(nums[i]==nums[ind]) return nums[i];
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
            }
        }
        return -1;
    }
}