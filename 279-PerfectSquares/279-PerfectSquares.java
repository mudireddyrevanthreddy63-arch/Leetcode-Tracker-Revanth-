// Last updated: 11/08/2026, 14:21:37
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        // Initialize with max value
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;

        // Precompute all squares <= n
        int maxSquareIndex = (int)Math.sqrt(n);
        int[] squares = new int[maxSquareIndex];
        for (int i = 1; i <= maxSquareIndex; i++) {
            squares[i - 1] = i * i;
        }

        // Fill dp
        for (int i = 1; i <= n; i++) {
            for (int square : squares) {
                if (i < square) break;
                dp[i] = Math.min(dp[i], dp[i - square] + 1);
            }
        }

        return dp[n];
    }
}