// Last updated: 08/09/2026, 10:00:17
1class Solution {
2    public int maxFrequency(int[] nums, int k) {
3        Arrays.sort(nums);
4        long sum = 0;
5        int left = 0, result = 0;
6        
7        for (int right = 0; right < nums.length; right++) {
8            sum += nums[right];
9            while ((long) nums[right] * (right - left + 1) - sum > k) {
10                sum -= nums[left];
11                left++;
12            }
13            result = Math.max(result, right - left + 1);
14        }
15        return result;
16    }
17}
18