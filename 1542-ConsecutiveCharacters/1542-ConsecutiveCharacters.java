// Last updated: 11/08/2026, 14:15:31
class Solution {
    public int maxPower(String s) {
        int maxCount = 1;
        int count = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 1; // reset when different char
            }
        }
        
        return maxCount;
    }
}
