// Last updated: 11/08/2026, 14:15:20
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int ans = -1;
        int[] lastSeen = new int[26];
        Arrays.fill(lastSeen, -1);
        for (int i = 0; i < s.length(); ++i) {
            int c = s.charAt(i) - 'a';
            if (lastSeen[c] == -1) {
                lastSeen[c] = i;
            } else {
                ans = Math.max(ans, i - lastSeen[c] - 1);
            }
        }
        return ans;
    }
}
