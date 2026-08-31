// Last updated: 31/08/2026, 19:55:35
1class Solution {
2    public boolean find132pattern(int[] nums) {
3        int n = nums.length;
4        Deque<Integer> stack = new ArrayDeque<>();
5        int third = Integer.MIN_VALUE; 
6        
7        for (int i = n - 1; i >= 0; i--) {
8            if (nums[i] < third) return true; 
9            while (!stack.isEmpty() && nums[i] > stack.peek()) {
10                third = stack.pop();
11            }
12            stack.push(nums[i]);
13        }
14        return false;
15    }
16}
17