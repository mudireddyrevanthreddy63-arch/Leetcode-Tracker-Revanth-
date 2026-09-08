// Last updated: 08/09/2026, 09:57:15
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        Map<Integer, Integer> count = new HashMap<>();
4        count.put(0, 1);
5        int sum = 0, result = 0;
6        
7        for (int num : nums) {
8            sum += num;
9            result += count.getOrDefault(sum - goal, 0);
10            count.put(sum, count.getOrDefault(sum, 0) + 1);
11        }
12        return result;
13    }
14}
15