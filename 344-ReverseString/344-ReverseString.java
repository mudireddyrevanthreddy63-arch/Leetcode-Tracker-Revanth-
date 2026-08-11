// Last updated: 11/08/2026, 14:21:23
class Solution {
    public void reverseString(char[] s) {
        int a = 0, e = s.length - 1;
        while (a < e) {
            char temp = s[a];   
            s[a] = s[e];
            s[e] = temp;
            a++;
            e--;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}