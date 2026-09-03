// Last updated: 03/09/2026, 09:34:06
1import java.util.*;
2
3class Solution {
4    public List<Integer> findAnagrams(String s, String p) {
5        List<Integer> result = new ArrayList<>();
6        if (s.length() < p.length()) return result;
7        
8        int[] countP = new int[26];
9        int[] countS = new int[26];
10        
11        for (char c : p.toCharArray()) {
12            countP[c - 'a']++;
13        }
14        
15        int window = p.length();
16        for (int i = 0; i < s.length(); i++) {
17            countS[s.charAt(i) - 'a']++;
18            
19            if (i >= window) {
20                countS[s.charAt(i - window) - 'a']--;
21            }
22            
23            if (Arrays.equals(countP, countS)) {
24                result.add(i - window + 1);
25            }
26        }
27        
28        return result;
29    }
30}
31