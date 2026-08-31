// Last updated: 31/08/2026, 20:03:32
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3
4        int first = -1;
5        int left = 0, right = nums.length - 1;
6
7        while (left <= right) {
8            int mid = left + (right - left) / 2;
9
10            if (nums[mid] == target) {
11                first = mid;
12                right = mid - 1;
13            } else if (nums[mid] < target) {
14                left = mid + 1;
15            } else {
16                right = mid - 1;
17            }
18        }
19
20        if (first == -1) {
21            System.gc();
22            return new int[]{-1, -1};
23        }
24
25        int last = -1;
26        left = 0;
27        right = nums.length - 1;
28
29        while (left <= right) {
30            int mid = left + (right - left) / 2;
31
32            if (nums[mid] == target) {
33                last = mid;
34                left = mid + 1;
35            } else if (nums[mid] < target) {
36                left = mid + 1;
37            } else {
38                right = mid - 1;
39            }
40        }
41        System.gc();
42        return new int[]{first, last};
43    }
44}