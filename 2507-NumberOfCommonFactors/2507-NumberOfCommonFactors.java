// Last updated: 11/08/2026, 14:15:11
class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }

        return count;
    }
}