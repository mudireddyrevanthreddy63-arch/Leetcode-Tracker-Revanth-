// Last updated: 11/08/2026, 14:18:22
class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[256]; 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch] == 1) {
                return i; 
            }
        }
        return -1;
    }
}