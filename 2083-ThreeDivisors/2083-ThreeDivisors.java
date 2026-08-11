// Last updated: 11/08/2026, 14:14:57
class Solution {
    public boolean isThree(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            
            if (count > 3) {
                return false;
            }
        }

        return count == 3;
    }
}