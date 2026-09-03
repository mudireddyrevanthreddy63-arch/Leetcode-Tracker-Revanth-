// Last updated: 03/09/2026, 09:26:31
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0, right = height.length - 1;
4        int max = 0;
5        while (left < right) {
6            int area = (right - left) * Math.min(height[left], height[right]);
7            max = Math.max(max, area);
8            if (height[left] < height[right]) {
9                left++;
10            } else {
11                right--;
12            }
13        }
14        return max;
15    }
16}
17