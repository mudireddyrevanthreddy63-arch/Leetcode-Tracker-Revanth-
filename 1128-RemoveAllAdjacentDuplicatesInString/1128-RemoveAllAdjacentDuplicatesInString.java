// Last updated: 11/08/2026, 14:16:26
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> S = new Stack<>();
        
        for(char a : s.toCharArray())
            {
                if(!S.isEmpty() && S.peek()==a)
                {
                   S.pop(); 
                }else{
                    S.push(a);
                }
            }    
        StringBuilder sb = new StringBuilder();
            for(char e : S)
            {
                sb.append(e);
            }
            return sb.toString();
    }
}