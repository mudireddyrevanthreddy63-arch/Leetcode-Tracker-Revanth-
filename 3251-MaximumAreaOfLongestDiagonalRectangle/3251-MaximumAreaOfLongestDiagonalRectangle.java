// Last updated: 11/08/2026, 14:14:19
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonal = 0;
        int maxArea = 0;
        for (int[] d : dimensions) {
            int w = d[0], h = d[1];
            int diagonal = w * w + h * h;
            int area = w * h;
            if (diagonal > maxDiagonal || (diagonal == maxDiagonal && area > maxArea)) {
                maxDiagonal = diagonal;
                maxArea = area;
            }
        }
        return maxArea;
    }
}
