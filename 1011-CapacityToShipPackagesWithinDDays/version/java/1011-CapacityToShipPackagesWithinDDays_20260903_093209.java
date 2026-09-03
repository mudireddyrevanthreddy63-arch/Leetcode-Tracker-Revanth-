// Last updated: 03/09/2026, 09:32:09
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        int left = 0, right = (int)Math.sqrt(c);
4        while (left <= right) {
5            long sum = (long)left * left + (long)right * right;
6            if (sum == c) return true;
7            else if (sum < c) left++;
8            else right--;
9        }
10        return false;
11    }
12}
13