class Solution {
    public int maximumCount(int[] nums) {
        int maxpos = nums.length - pos(nums);
        int maxneg = neg(nums);
        return Math.max(maxpos, maxneg);
    }

    public int pos(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int ans = nums.length;   

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (nums[m] > 0) {
                ans = m;
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        return ans;
    }

    public int neg(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int ans = 0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (nums[m] < 0) {
                ans = m + 1;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        return ans;
    }
}