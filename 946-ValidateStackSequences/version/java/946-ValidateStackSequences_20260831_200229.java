// Last updated: 31/08/2026, 20:02:29
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first = findBound(nums, target, true);
4        if (first == -1) return new int[]{-1, -1};
5        int last = findBound(nums, target, false);
6        return new int[]{first, last};
7    }
8    
9    private int findBound(int[] nums, int target, boolean isFirst) {
10        int left = 0, right = nums.length - 1, bound = -1;
11        while (left <= right) {
12            int mid = left + (right - left) / 2;
13            if (nums[mid] == target) {
14                bound = mid;
15                if (isFirst) right = mid - 1;
16                else left = mid + 1;
17            } else if (nums[mid] < target) {
18                left = mid + 1;
19            } else {
20                right = mid - 1;
21            }
22        }
23        return bound;
24    }
25}
26