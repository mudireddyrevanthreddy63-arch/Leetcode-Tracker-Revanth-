// Last updated: 11/08/2026, 14:18:12
class Solution {
    public int countSegments(String s) {
        String[] parts = s.trim().split("\\s+");
        if (s.trim().isEmpty()) return 0;
        
        return parts.length;
    }
}
