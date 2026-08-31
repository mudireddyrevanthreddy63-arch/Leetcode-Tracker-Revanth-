// Last updated: 31/08/2026, 19:49:38
1class Solution {
2    public int calculate(String s) {
3        Deque<Integer> stack = new ArrayDeque<>();
4        int num = 0;
5        char sign = '+';
6        int n = s.length();
7        
8        for (int i = 0; i < n; i++) {
9            char c = s.charAt(i);
10            if (Character.isDigit(c)) {
11                num = num * 10 + (c - '0');
12            }
13            if ((!Character.isDigit(c) && c != ' ') || i == n - 1) {
14                if (sign == '+') {
15                    stack.push(num);
16                } else if (sign == '-') {
17                    stack.push(-num);
18                } else if (sign == '*') {
19                    stack.push(stack.pop() * num);
20                } else if (sign == '/') {
21                    stack.push(stack.pop() / num);
22                }
23                sign = c;
24                num = 0;
25            }
26        }
27        
28        int result = 0;
29        for (int val : stack) result += val;
30        return result;
31    }
32}
33