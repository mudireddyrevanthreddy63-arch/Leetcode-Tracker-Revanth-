// Last updated: 11/08/2026, 14:16:14
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }
        
        return new String(result);
    }
}
