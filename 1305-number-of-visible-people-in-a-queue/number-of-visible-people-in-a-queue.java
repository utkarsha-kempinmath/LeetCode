class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int[] ans = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        for(int j=0; j<ans.length; j++){
            ans[j] = 0;
        }
        for(int i = heights.length - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() < heights[i]) {
                st.pop();
                ans[i]++;
            }
            if(!st.isEmpty()){
                ans[i]++;
            }
            st.push(heights[i]);
        }
        return ans;
    }
}