// Last updated: 31/08/2026, 19:52:51
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n = nums.length;
4        int[] res = new int[n];
5        Arrays.fill(res, -1);
6        Deque<Integer> stack = new ArrayDeque<>();
7        
8        for (int i = 0; i < 2 * n; i++) {
9            int num = nums[i % n];
10            while (!stack.isEmpty() && nums[stack.peek()] < num) {
11                res[stack.pop()] = num;
12            }
13            if (i < n) stack.push(i);
14        }
15        return res;
16    }
17}
18