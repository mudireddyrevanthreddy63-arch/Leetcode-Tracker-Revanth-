// Last updated: 03/09/2026, 09:27:28
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> threeSum(int[] nums) {
5        Arrays.sort(nums);
6        List<List<Integer>> res = new ArrayList<>();
7        
8        for (int i = 0; i < nums.length - 2; i++) {
9            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates
10            int left = i + 1, right = nums.length - 1;
11            
12            while (left < right) {
13                int sum = nums[i] + nums[left] + nums[right];
14                if (sum == 0) {
15                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
16                    left++;
17                    right--;
18                    while (left < right && nums[left] == nums[left - 1]) left++; 
19                    while (left < right && nums[right] == nums[right + 1]) right--; 
20                } else if (sum < 0) {
21                    left++;
22                } else {
23                    right--;
24                }
25            }
26        }
27        return res;
28    }
29}
30