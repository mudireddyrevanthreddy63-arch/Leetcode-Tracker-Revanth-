// Last updated: 11/08/2026, 14:16:51
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];
        
        // Pass 1: Left to Right
        int prev = -n; // initialize far left
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            result[i] = i - prev;
        }
        
        // Pass 2: Right to Left
        prev = 2 * n; // initialize far right
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            result[i] = Math.min(result[i], prev - i);
        }
        
        return result;
    }
}
