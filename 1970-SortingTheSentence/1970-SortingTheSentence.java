// Last updated: 11/08/2026, 14:15:02
class Solution {
    public String sortSentence(String s) {
        String[] parts = s.split(" ");
        String[] ordered = new String[parts.length];
        for (String token : parts) {
            int pos = token.charAt(token.length() - 1) - '0';
            ordered[pos - 1] = token.substring(0, token.length() - 1);
        }
        return String.join(" ", ordered);
    }
}
