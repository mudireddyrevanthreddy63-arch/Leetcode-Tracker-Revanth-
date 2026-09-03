// Last updated: 03/09/2026, 09:22:31
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int left = 0, right = nums.length - 1;
4        while (left < right) {
5            int mid = left + (right - left) / 2;
6            if (nums[mid] == nums[mid ^ 1]) {
7                left = mid + 1;
8            } else {
9                right = mid;
10            }
11        }
12        return nums[left];
13    }
14}
15