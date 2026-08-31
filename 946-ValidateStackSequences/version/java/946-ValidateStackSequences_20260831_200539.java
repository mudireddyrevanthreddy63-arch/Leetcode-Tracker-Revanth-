// Last updated: 31/08/2026, 20:05:39
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int row = matrix.length;
4        int collum = matrix[0].length;
5        int i = 0;
6        int l = 0;
7        int r = row -1;
8
9        while(l <= r){
10            int mid = (l+r)/2;
11            System.out.println(mid);
12            if(matrix[mid][collum-1] == target) {
13                return true;
14            }
15            else if(matrix[mid][collum-1] > target) {
16                r = mid-1;
17                i = mid;
18            }
19            else {
20                l = mid + 1;
21            };
22        }
23
24
25
26        l = 0;
27        r = collum-1;
28        System.out.println(i);
29        while(l <= r){
30            int mid = (l+r)/2;
31            if(matrix[i][mid] == target) return true;
32            else if(matrix[i][mid] > target) r = mid -1 ;
33            else l = mid + 1;
34        }
35        return false;
36    }
37}