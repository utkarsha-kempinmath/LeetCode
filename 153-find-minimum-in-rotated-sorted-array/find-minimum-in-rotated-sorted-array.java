class Solution {
    public int findMin(int[] nums) {
        int s = 0;
        int a = nums[0];
        int e = nums.length - 1;
        int m = s + (e - s) / 2;
        while (s <= e) {
            if (nums[0] <= nums[nums.length - 1])
                return nums[0];
            if (nums[m] >= a)
                s = m + 1;
            else {
                if (m > 0 && nums[m] < nums[m - 1])
                    return nums[m];
                else
                    e = m - 1;
            }
            m = s + (e - s) / 2;
        }
        return -1;
    }
}