// Last updated: 31/08/2026, 19:47:20
1class Solution {
2    public boolean validateStackSequences(int[] pushed, int[] popped) {
3        Deque<Integer> stack = new ArrayDeque<>();
4        int i = 0;
5        for (int x : pushed) {
6            stack.push(x);
7            while (!stack.isEmpty() && stack.peek() == popped[i]) {
8                stack.pop();
9                i++;
10            }
11        }
12        return i == popped.length;
13    }
14}
15