class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = first(nums, target);
        if (ans[0] == -1) return ans; 

        ans[1] = last(nums, target);

        return ans;
    }
    public int first(int[] nums, int target){
        int s=0;
        int e = nums.length-1;
        int mid = s + (e-s)/2;
        int ans=-1;
        while(s<=e){
            if(nums[mid] == target){
                ans = mid;
                e = mid - 1;
            }
            else if(nums[mid]<target){
                s = mid+1;
            }
            else if(nums[mid]>target){
                e = mid-1;
            }
            mid = s + (e-s)/2;
        }
        
        return ans;
    }
    public int last(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                ans = mid;
                s = mid + 1;      
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }
}