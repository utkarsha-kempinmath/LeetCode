class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> current = new ArrayList<>();
        return part(s, ans, current, 0);
    }

    public List<List<String>> part(String s, List<List<String>> ans, List<String> current, int i) {
        if (i == s.length()) {
            ans.add(new ArrayList<>(current));
            return ans;
        }
        String sub = "";
        for (int j = i; j < s.length(); j++) {
            sub = (s.substring(i, j + 1));
            if (expand(sub)) {
                current.add(sub.toString());
                part(s, ans, current, j + 1);
                current.remove(current.size() - 1);
            }
        }
        return ans;
    }

    public Boolean expand(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l <=r ) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}