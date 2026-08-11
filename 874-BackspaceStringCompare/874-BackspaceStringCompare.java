// Last updated: 11/08/2026, 14:16:49
class Solution 
{
    public boolean backspaceCompare(String s, String t) 
    {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> t1 = new Stack<>();
        char arr[] = s.toCharArray();
        char arr1[] = t.toCharArray();
       for(char a : arr)
       {
        if(a =='#')
        {
            if(!s1.isEmpty())
            {
                s1.pop();
            }
        }else{
                s1.push(a);
            }
       }
       for(char b : arr1)
       {
         if(b =='#')
        {
            if(!t1.isEmpty())
            {
                t1.pop();
            }
        }else{
                t1.push(b);
            }
       }
        String x = String.valueOf(s1);
        String y = String.valueOf(t1);
        if(x.equals(y))
        return true;
        else
        return false;
       
    }
}