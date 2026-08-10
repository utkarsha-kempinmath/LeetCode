class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        Stack<Character> temp = new Stack<>();
        for(int i=0; i < s.length(); i++){
            st.push(s.charAt(i));
        }
        while(st.size() != 0){
            char ch = st.pop();
            if(temp.size() == 0 || ch != temp.peek()) temp.push(ch);
            else{
                temp.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(temp.size() != 0){
            sb.append(temp.pop());
        }
        String ans = sb.toString();
        return ans;
    }
}