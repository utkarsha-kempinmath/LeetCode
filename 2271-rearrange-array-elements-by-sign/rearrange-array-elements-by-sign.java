class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] neg = new int[nums.length/2];
        int[] pos = new int[nums.length/2];
        int[] ans = new int[nums.length];
        int p=0;
        int n=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                    pos[p] = nums[i];
                    p++;
            }
            else{
                    neg[n] = nums[i];
                    n++;
            }
        }
        int p1=0;
        int n1=0;
        for(int i=0; i<ans.length; i++){
            if(i%2 == 0){
                    ans[i] = pos[p1];
                    p1++;
            }
            else {
                    ans[i] = neg[n1];
                    n1++;
            }
        }
        return ans;
    }
}