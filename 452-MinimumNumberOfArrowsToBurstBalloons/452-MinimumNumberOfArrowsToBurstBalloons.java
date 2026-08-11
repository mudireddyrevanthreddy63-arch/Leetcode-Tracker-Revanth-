// Last updated: 11/08/2026, 14:18:06
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));
        int n = 0;
        long end = Long.MIN_VALUE;
        for(int[] ballon : points)
        {
            if(ballon[0] <= end)
               continue;
            else{
                n++;
                end = ballon[1];
            }
        }
        return n;
    }
}