class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> st = new Stack<>();
        int m = part.length();
        int n = s.length();
        for(char ch : s.toCharArray()){
            st.push(ch);
            Boolean match = true;

            if(st.size() >= m){
                List<Character> lt = new ArrayList<>();
                for(int i = m-1 ; i >= 0 ; i--){
                    char t = st.peek();
                    st.pop();

                    lt.add(t);
                    if(t != part.charAt(i)){
                        match = false;
                    }
                }
                if(!match){
                    for(int i = lt.size() - 1 ; i >= 0 ; i--){
                        st.push(lt.get(i));
                    }
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}