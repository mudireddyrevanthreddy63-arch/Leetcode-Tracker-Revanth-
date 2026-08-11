// Last updated: 11/08/2026, 14:14:52
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int maxLen = 0;
        int i = 0;
        
        while (i < s.length()) {
            int count0 = 0, count1 = 0;
            while (i < s.length() && s.charAt(i) == '0') {
                count0++;
                i++;
            }
            while (i < s.length() && s.charAt(i) == '1') {
                count1++;
                i++;
            }
            maxLen = Math.max(maxLen, 2 * Math.min(count0, count1));
        }
        
        return maxLen;
    }
}
