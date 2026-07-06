class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        return par(ans, current, n, n);
    }

    public static List<String> par(List<String> ans, StringBuilder current, int open, int close) {
        if (open == 0 && close == 0) {
            ans.add(current.toString());
            return ans;
        }
        if (open > 0) {
            current.append("(");
            par(ans, current, open - 1, close);
            current.deleteCharAt(current.length() - 1);
        }
        if (close > 0) {
            if (close > open) {
                current.append(")");
                par(ans, current, open, close - 1);
                current.deleteCharAt(current.length() - 1);
            }
        }
        return ans;
    }
}