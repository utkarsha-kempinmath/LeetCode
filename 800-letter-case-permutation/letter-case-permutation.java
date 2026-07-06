class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        return solve(s, 0, ans, current);
    }
    public static List<String>solve(String s, int i, List<String>ans, StringBuilder current){
        if(i==s.length()){
            ans.add(current.toString());
            return ans;
        }
        if(s.charAt(i)>='a' && s.charAt(i)<='z'){
            char ch = s.charAt(i);
            current.append(Character.toUpperCase(ch));
            solve(s, i+1, ans, current);
            current.deleteCharAt(current.length() - 1);
            current.append(s.charAt(i));  
            solve(s, i + 1, ans, current);
            current.deleteCharAt(current.length() - 1);
        }
        else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
            char ch = s.charAt(i);
            current.append(Character.toLowerCase(ch));
            solve(s, i+1, ans, current);
            current.deleteCharAt(current.length() - 1);
            current.append(s.charAt(i));  
            solve(s, i + 1, ans, current);
            current.deleteCharAt(current.length() - 1);
        }
        else{
            current.append(s.charAt(i));  
            solve(s, i + 1, ans, current);
            current.deleteCharAt(current.length() - 1);
        }
        return ans;
    }
}