// Last updated: 11/08/2026, 14:15:50
class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < k; i++) {
            sb.append(words[i]);
            if (i < k - 1) sb.append(" ");
        }
        
        return sb.toString();
    }
}
