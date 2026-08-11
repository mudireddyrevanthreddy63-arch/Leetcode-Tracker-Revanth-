// Last updated: 11/08/2026, 14:17:55
class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) return true;     
        if (word.equals(word.toLowerCase())) return true;     
        if (Character.isUpperCase(word.charAt(0)) && 
            word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;                                   
        }
        return false;
    }
}
