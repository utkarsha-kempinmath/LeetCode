class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        String[] map = {
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        return letcom(digits, current, map, ans, 0);
    }

    public List<String> letcom(String digit, StringBuilder current, String[] map, List<String> ans, int i) {
        if (current.length() == digit.length()) {
            ans.add(current.toString());
            return ans;
        }
        String letters = map[digit.charAt(i) - '0'];
        for (int j = 0; j < letters.length(); j++) {
            char ch = letters.charAt(j);
            current.append(ch);
            if(digit.length() == 0)
                return ans;
            letcom(digit, current, map, ans, i+1);
            current.deleteCharAt(current.length()-1);
        }
        return ans;
    }
}