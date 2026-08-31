// Last updated: 31/08/2026, 19:51:57
1class Solution {
2    public String removeKdigits(String num, int k) {
3        Deque<Character> stack = new ArrayDeque<>();
4        for (char c : num.toCharArray()) {
5            while (k > 0 && !stack.isEmpty() && stack.peekLast() > c) {
6                stack.pollLast();
7                k--;
8            }
9            stack.addLast(c);
10        }
11        
12        
13        while (k > 0 && !stack.isEmpty()) {
14            stack.pollLast();
15            k--;
16        }
17        
18        
19        StringBuilder sb = new StringBuilder();
20        for (char c : stack) sb.append(c);
21        
22        
23        while (sb.length() > 0 && sb.charAt(0) == '0') {
24            sb.deleteCharAt(0);
25        }
26        
27        return sb.length() == 0 ? "0" : sb.toString();
28    }
29}
30