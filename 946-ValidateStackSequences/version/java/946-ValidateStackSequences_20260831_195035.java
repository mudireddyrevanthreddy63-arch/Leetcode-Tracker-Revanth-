// Last updated: 31/08/2026, 19:50:35
1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3        return atMost(nums, k) - atMost(nums, k - 1);
4    }
5
6    private int atMost(int[] nums, int k) {
7        Map<Integer, Integer> freq = new HashMap<>();
8        int left = 0, res = 0;
9        for (int right = 0; right < nums.length; right++) {
10            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
11            if (freq.get(nums[right]) == 1) k--; // new distinct
12            
13            while (k < 0) {
14                freq.put(nums[left], freq.get(nums[left]) - 1);
15                if (freq.get(nums[left]) == 0) k++;
16                left++;
17            }
18            res += right - left + 1;
19        }
20        return res;
21    }
22}
23