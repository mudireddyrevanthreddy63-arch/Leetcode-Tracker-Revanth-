// Last updated: 11/08/2026, 14:18:21
class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) return c;
        }
        return ' ';
    }
}
