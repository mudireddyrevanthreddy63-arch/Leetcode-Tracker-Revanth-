// Last updated: 31/08/2026, 20:04:55
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length, n = matrix[0].length;
4        int left = 0, right = m * n - 1;
5        
6        while (left <= right) {
7            int mid = left + (right - left) / 2;
8            int val = matrix[mid / n][mid % n];
9            
10            if (val == target) return true;
11            else if (val < target) left = mid + 1;
12            else right = mid - 1;
13        }
14        
15        return false;
16    }
17}
18