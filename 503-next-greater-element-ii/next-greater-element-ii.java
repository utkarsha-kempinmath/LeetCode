class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int max = Integer.MIN_VALUE;
        int[] ans = new int[nums.length];
        int d = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
                d = i;
            }
        }
        int n = nums.length;
        int k = (d + 1) % n;
        swap(nums, 0, k-1);
        swap(nums, k, n-1);
        swap(nums, 0, n-1);

        for(int i = nums.length-1; i>=0; i--){
            while(st.size() != 0 && nums[i] >= st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(nums[i]);
        }

        if(k != 0){
            swap(ans, 0, n - k - 1);
            swap(ans, n - k, n - 1);
            swap(ans, 0, n - 1);
        }
        
        return ans;
    }
    
    public void swap(int[] nums, int a, int b){
        while(a<b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }
}