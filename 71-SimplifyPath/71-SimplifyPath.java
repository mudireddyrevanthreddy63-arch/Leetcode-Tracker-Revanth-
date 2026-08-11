// Last updated: 11/08/2026, 14:20:22
class Solution {
    public String simplifyPath(String path) {
        String[]arr = path.split("/");
        Stack<String> st = new Stack<>();
        for(String ele : arr)
        {
            if(ele.equals("") || ele.equals("."))
            continue;
            else if(ele.equals(".."))
            {
            if(!st.isEmpty())
            st.pop();
            }else
            st.push(ele);
        }
        if(st.isEmpty())
        return "/";
        StringBuilder sb = new StringBuilder();
        for(String ele : st)
        {
            sb.append("/");
            sb.append(ele);
        }
        return sb.toString();
    }
}