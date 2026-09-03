// Last updated: 03/09/2026, 09:35:21
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        if (s1.length() > s2.length()) return false;
4        
5        int[] count1 = new int[26];
6        int[] count2 = new int[26];
7        
8        for (char c : s1.toCharArray()) {
9            count1[c - 'a']++;
10        }
11        
12        int window = s1.length();
13        for (int i = 0; i < s2.length(); i++) {
14            count2[s2.charAt(i) - 'a']++;
15            
16            if (i >= window) {
17                count2[s2.charAt(i - window) - 'a']--;
18            }
19            
20            if (Arrays.equals(count1, count2)) return true;
21        }
22        
23        return false;
24    }
25}
26