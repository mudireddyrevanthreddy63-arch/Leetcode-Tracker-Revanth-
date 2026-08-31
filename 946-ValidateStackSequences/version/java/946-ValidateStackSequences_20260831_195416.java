// Last updated: 31/08/2026, 19:54:16
1class Solution {
2    public String removeDuplicateLetters(String s) {
3        int[] freq = new int[26];
4        boolean[] visited = new boolean[26];
5        
6        for (char c : s.toCharArray()) {
7            freq[c - 'a']++;
8        }
9        
10        Deque<Character> stack = new ArrayDeque<>();
11        
12        for (char c : s.toCharArray()) {
13            freq[c - 'a']--;
14            if (visited[c - 'a']) continue;
15            
16            while (!stack.isEmpty() && stack.peekLast() > c && freq[stack.peekLast() - 'a'] > 0) {
17                visited[stack.pollLast() - 'a'] = false;
18            }
19            
20            stack.addLast(c);
21            visited[c - 'a'] = true;
22        }
23        
24        StringBuilder sb = new StringBuilder();
25        for (char c : stack) sb.append(c);
26        return sb.toString();
27    }
28}
29