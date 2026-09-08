// Last updated: 08/09/2026, 09:58:34
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if (k <= 1) return 0;
4        int left = 0;
5        int count = 0;
6        long product = 1;
7        
8        for (int right = 0; right < nums.length; right++) {
9            product *= nums[right];
10            while (product >= k) {
11                product /= nums[left];
12                left++;
13            }
14            count += right - left + 1;
15        }
16        return count;
17    }
18}
19