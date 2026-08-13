// Last updated: 13/08/2026, 11:10:49
1class Solution {
2    public String countAndSay(int n) {
3        String s = "1";
4        for (int i = 1; i < n; i++) {
5            StringBuilder sb = new StringBuilder();
6            int count = 1;
7            for (int j = 1; j <= s.length(); j++) {
8                if (j < s.length() && s.charAt(j) == s.charAt(j - 1)) {
9                    count++;
10                } else {
11                    sb.append(count).append(s.charAt(j - 1));
12                    count = 1;
13                }
14            }
15            s = sb.toString();
16        }
17        return s;
18    }
19}
20