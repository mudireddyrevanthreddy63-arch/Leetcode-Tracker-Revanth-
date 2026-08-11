// Last updated: 11/08/2026, 14:15:04
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true;
        }
        for (boolean b : seen) {
            if (!b) return false;
        }
        return true;
    }
}
