// Last updated: 06/09/2026, 08:08:24
1class Solution {
2    public int countGoodRotations(int[] nums) {
3        int n = nums.length;
4        int[] peldarquin = nums; 
5
6        
7        int[] nums2 = new int[2 * n];
8        for (int i = 0; i < n; i++) {
9            nums2[i] = nums[i];
10            nums2[i + n] = nums[i];
11        }
12
13        
14        long[] prefix = new long[2 * n + 1];
15        for (int i = 0; i < 2 * n; i++) {
16            prefix[i + 1] = prefix[i] + nums2[i];
17        }
18
19        int result = 0;
20        for (int i = 0; i < n; i++) {
21            long firstHalf = prefix[i + n/2] - prefix[i];
22            long secondHalf = prefix[i + n] - prefix[i + n/2];
23            if (firstHalf > secondHalf) {
24                result++;
25            }
26        }
27
28        return result;
29    }
30}
31