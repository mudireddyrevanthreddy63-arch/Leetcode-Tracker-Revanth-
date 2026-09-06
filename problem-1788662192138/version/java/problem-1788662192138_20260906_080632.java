// Last updated: 06/09/2026, 08:06:32
1class Solution {
2    public int countRotations(String s, int k) {
3        int n = s.length();
4        int result = 0;
5
6        for(int i = 0; i < n;i++)
7        {
8            String rotated = s.substring(i) + s.substring(0, i);
9
10            int score = 0;
11            for(int j = 0; j < n - 1;j++) {
12                if(rotated.charAt(j) == rotated.charAt(j + 1)) {
13                    score++;
14                }
15            }
16            if(score == k) {
17                result++;
18            }
19        }
20
21        return result;
22    }
23}