// Last updated: 03/09/2026, 09:24:02
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        int n = matrix.length;
4        int lo = matrix[0][0], hi = matrix[n-1][n-1];
5        
6        while (lo < hi) {
7            int mid = lo + (hi - lo) / 2;
8            int count = countLessEqual(matrix, mid);
9            if (count < k) {
10                lo = mid + 1;
11            } else {
12                hi = mid;
13            }
14        }
15        return lo;
16    }
17    
18    private int countLessEqual(int[][] matrix, int target) {
19        int n = matrix.length;
20        int count = 0, row = n - 1, col = 0;
21        while (row >= 0 && col < n) {
22            if (matrix[row][col] <= target) {
23                count += row + 1;
24                col++;
25            } else {
26                row--;
27            }
28        }
29        return count;
30    }
31}
32