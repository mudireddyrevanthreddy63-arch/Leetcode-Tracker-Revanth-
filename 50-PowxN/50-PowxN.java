// Last updated: 11/08/2026, 14:20:36
class Solution {
    public double myPow(double x, int n) {
        long N = n; // use long to avoid overflow
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1;
        while (N > 0) {
            if (N % 2 == 1) result *= x;
            x *= x;
            N /= 2;
        }
        return result;
    }
}
