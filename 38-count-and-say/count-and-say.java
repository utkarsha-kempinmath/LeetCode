class Solution {
    public String countAndSay(int n) {
        return rle(n).toString();
    }

    public StringBuilder rle(int n) {
        if (n == 1) {
            return new StringBuilder("1");
        }

        StringBuilder s = rle(n - 1);
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            int count = 0;
            while(i < s.length() && s.charAt(i) == ch){
                count++;
                i++;
            }

            ans.append(count).append(ch);
        }
        return ans;
    }
}