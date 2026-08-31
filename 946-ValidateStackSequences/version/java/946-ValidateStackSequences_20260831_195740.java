// Last updated: 31/08/2026, 19:57:40
1class Solution {
2    public int mySqrt(int x) {
3        if (x < 2) return x;
4        
5        int left = 1, right = x / 2, ans = 0;
6        while (left <= right) {
7            int mid = left + (right - left) / 2;
8            long sq = (long) mid * mid;
9            if (sq == x) return mid;
10            if (sq < x) {
11                ans = mid;
12                left = mid + 1;
13            } else {
14                right = mid - 1;
15            }
16        }
17        return ans;
18    }
19}
20