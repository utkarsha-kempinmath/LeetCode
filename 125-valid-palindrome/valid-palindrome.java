class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (isValid(s.charAt(i))) {
                sr.append(toLower(s.charAt(i)));
            }
        }

        for (int j = 0; j < sr.length() / 2; j++) {
            if (sr.charAt(j) != sr.charAt(sr.length() - 1 - j)) {
                return false;
            }
        }

        return true;
    }

    public boolean isValid(char ch) {
        return (ch >= 'a' && ch <= 'z') ||
               (ch >= 'A' && ch <= 'Z') ||
               (ch >= '0' && ch <= '9');
    }

    public char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char)(ch - 'A' + 'a');
        }
        return ch;
    }
}