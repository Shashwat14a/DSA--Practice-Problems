class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n = s.length();
        int m = t.length();

        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);

            if(ch == '#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }

        Stack<Character> at = new Stack<>();

        for(int i = 0 ; i < m ; i++){
            char ch = t.charAt(i);

            if(ch == '#'){
                if(!at.isEmpty()){
                    at.pop();
                }
            }
            else{
                at.push(ch);
            }
        }

        return st.equals(at);
    }
}