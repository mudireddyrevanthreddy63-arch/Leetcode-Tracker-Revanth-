// Last updated: 11/08/2026, 14:14:59
class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq = new int[26];
        for (String word : words) {
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }
        }
        int n = words.length;
        for (int count : freq) {
            if (count % n != 0) return false;
        }
        return true;
    }
}
