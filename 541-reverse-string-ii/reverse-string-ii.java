class Solution {
    public String reverseStr(String s, int k) {
        char[] ans = s.toCharArray();
        for(int start = 0; start < ans.length; start += 2 * k){
            int left = start;
            int right = Math.min(start + k - 1, ans.length - 1);
            while(left < right){
                char temp = ans[left];
                ans[left] = ans[right];
                ans[right] = temp;
                left++;
                right--;
            }
        }
        return new String(ans);
    }
}
