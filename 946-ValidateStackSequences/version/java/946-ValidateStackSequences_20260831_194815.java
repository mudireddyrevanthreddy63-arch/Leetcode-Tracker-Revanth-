// Last updated: 31/08/2026, 19:48:15
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        Deque<Integer> stack = new ArrayDeque<>();
4        for (int a : asteroids) {
5            boolean alive = true;
6            while (alive && a < 0 && !stack.isEmpty() && stack.peek() > 0) {
7                if (stack.peek() < -a) {
8                    stack.pop();
9                } else if (stack.peek() == -a) {
10                    stack.pop();
11                    alive = false;
12                } else {
13                    alive = false;
14                }
15            }
16            if (alive) stack.push(a);
17        }
18        int[] result = new int[stack.size()];
19        for (int i = result.length - 1; i >= 0; i--) {
20            result[i] = stack.pop();
21        }
22        return result;
23    }
24}
25