// Last updated: 31/08/2026, 19:56:55
1public class Solution extends VersionControl {
2    public int firstBadVersion(int n) {
3        int left = 1, right = n;
4        while (left < right) {
5            int mid = left + (right - left) / 2;
6            if (isBadVersion(mid)) {
7                right = mid; 
8            } else {
9                left = mid + 1; 
10            }
11        }
12        return left;
13    }
14}
15