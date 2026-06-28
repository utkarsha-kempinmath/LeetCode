class Solution {
    public void sortColors(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        int mid = 0;
        while(mid<=e){
            if(nums[mid] == 0){
                int temp = nums[s];
                nums[s] = nums[mid];
                nums[mid] = temp;
                s++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[e];
                nums[e] = nums[mid];
                nums[mid] = temp;
                e--;
            }
        }
    }
}