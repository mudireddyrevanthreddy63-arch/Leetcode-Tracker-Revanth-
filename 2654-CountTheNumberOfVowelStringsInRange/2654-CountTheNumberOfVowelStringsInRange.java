// Last updated: 11/08/2026, 14:15:00
class Solution {
    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
    public int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            String w = words[i];
            if (isVowel(w.charAt(0)) && isVowel(w.charAt(w.length() - 1))) {
                ans++;
            }
        }
        return ans;
    }
}
