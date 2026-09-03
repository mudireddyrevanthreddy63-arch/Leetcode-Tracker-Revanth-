// Last updated: 03/09/2026, 09:19:52
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int left = 1, right = 0;
4        for (int p : piles) right = Math.max(right, p);
5        
6        while (left < right) {
7            int mid = left + (right - left) / 2;
8            long hours = 0;
9            for (int p : piles) {
10                hours += (p + mid - 1) / mid; // ceil division
11            }
12            if (hours <= h) {
13                right = mid;
14            } else {
15                left = mid + 1;
16            }
17        }
18        return left;
19    }
20}
21