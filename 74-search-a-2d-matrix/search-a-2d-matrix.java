class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean ans = false;
        for(int i=0; i< matrix.length; i++){
            ans = bs(matrix[i], target);
            if(ans==true) break;
        }
        return ans;
    }
    public boolean bs(int[] nums, int n){
        int s=0;
        int e = nums.length-1;
        int m = s + (e-s)/2;
        while(s<=e){
            if(nums[m]==n){
                return true;
            }
            else if(nums[m]<n){
                s=m+1;
            }
            else{
                e=m-1;
            }
            m = s + (e-s)/2;
        }
        return false;
    }
}