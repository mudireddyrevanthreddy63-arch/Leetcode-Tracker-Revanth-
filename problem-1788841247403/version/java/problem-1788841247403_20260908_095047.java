// Last updated: 08/09/2026, 09:50:47
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int left = 0, zeroCount = 0, best = 0;
4        for (int right = 0; right < nums.length; right++) {
5            if (nums[right] == 0) zeroCount++;
6            while (zeroCount > k) {
7                if (nums[left] == 0) zeroCount--;
8                left++;
9            }
10            best = Math.max(best, right - left + 1);
11        }
12        return best;
13    }
14}
15