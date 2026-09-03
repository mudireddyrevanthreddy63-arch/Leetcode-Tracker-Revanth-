// Last updated: 03/09/2026, 09:36:44
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int left = 0, sum = 0, minLen = Integer.MAX_VALUE;
4        
5        for (int right = 0; right < nums.length; right++) {
6            sum += nums[right];
7            
8            while (sum >= target) {
9                minLen = Math.min(minLen, right - left + 1);
10                sum -= nums[left++];
11            }
12        }
13        
14        return minLen == Integer.MAX_VALUE ? 0 : minLen;
15    }
16}
17