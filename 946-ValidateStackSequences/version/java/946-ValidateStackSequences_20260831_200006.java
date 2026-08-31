// Last updated: 31/08/2026, 20:00:06
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;
4        
5        while (left <= right) {
6            int mid = left + (right - left) / 2;
7            
8            if (nums[mid] == target) return true;
9            
10            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
11                left++;
12                right--;
13            } else if (nums[left] <= nums[mid]) { 
14                if (target >= nums[left] && target < nums[mid]) {
15                    right = mid - 1;
16                } else {
17                    left = mid + 1;
18                }
19            } else { 
20                if (target > nums[mid] && target <= nums[right]) {
21                    left = mid + 1;
22                } else {
23                    right = mid - 1;
24                }
25            }
26        }
27        
28        return false;
29    }
30}
31