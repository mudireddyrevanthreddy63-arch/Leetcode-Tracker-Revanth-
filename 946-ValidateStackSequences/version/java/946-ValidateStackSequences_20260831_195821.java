// Last updated: 31/08/2026, 19:58:21
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;
4        
5        while (left <= right) {
6            int mid = left + (right - left) / 2;
7            
8            if (nums[mid] == target) return mid;
9            
10            if (nums[left] <= nums[mid]) { // left half sorted
11                if (target >= nums[left] && target < nums[mid]) {
12                    right = mid - 1;
13                } else {
14                    left = mid + 1;
15                }
16            } else { // right half sorted
17                if (target > nums[mid] && target <= nums[right]) {
18                    left = mid + 1;
19                } else {
20                    right = mid - 1;
21                }
22            }
23        }
24        
25        return -1;
26    }
27}
28