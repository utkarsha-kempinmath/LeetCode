class Solution {
    public boolean rotateString(String s, String goal) {
        String st = s+s;
        if(goal.length()<s.length() || goal.length()>s.length()) return false;
        if(st.contains(goal)) return true;
        return false;
    }
}