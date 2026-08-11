// Last updated: 11/08/2026, 14:18:35
class Solution {
    public boolean rotateString(String s, String goal) {
        // Step 1: If lengths differ, impossible
        if (s.length() != goal.length()) {
            return false;
        }
        
        // Step 2: Concatenate s with itself
        String doubled = s + s;
        
        // Step 3: Check if goal is a substring of doubled
        return doubled.contains(goal);
    }
}
