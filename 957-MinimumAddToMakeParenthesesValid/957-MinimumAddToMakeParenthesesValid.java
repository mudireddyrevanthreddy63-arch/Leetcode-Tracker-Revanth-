// Last updated: 11/08/2026, 14:18:16
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st= new Stack<>();
        int count  = 0;
        for(char c :s.toCharArray()){
            if(c=='(')
            st.push(c);
            else{
                if(st.isEmpty())
                {
                    count++;
                }else{
                    st.pop();
                }
            }
        }
        return count+st.size();
    }
}