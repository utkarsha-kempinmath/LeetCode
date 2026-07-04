class Solution {
    public String longestPalindrome(String s) {
        String ans = "";

        for(int i = 0; i < s.length(); i++){
            String odd = expand(s, i, i);
            if (odd.length() > ans.length()) ans = odd;
            String even = expand(s, i, i + 1);
            if (even.length() > ans.length()) ans = even;
        }
        return ans;
    }

    public String expand(String s,int l, int r) {
        String pal = "";
        while(l>=0 && r<s.length()){
            if(s.charAt(l)!=s.charAt(r)){
                break;
            };
            pal = s.substring(l, r+1);
            l--;
            r++;
        }
        return pal;
    }
}