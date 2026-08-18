class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> st = new Stack<>();
        int area = 0;
        for(int i=0; i<heights.length; i++){
            int start = i;
            while(!st.isEmpty() && (heights[i] < st.peek()[0])){
                int[] top = st.pop();
                int height = top[0];
                start = top[1];
                int width = i-start;
                area = Math.max(area, height*width);
            }
            st.push(new int[]{heights[i], start});
        }

        while(!st.isEmpty()){
            int[] top = st.pop();
            int height = top[0];
            int start = top[1];
            int width = heights.length - start;
            area = Math.max(area, height * width);
        }
        return area;
    }
}