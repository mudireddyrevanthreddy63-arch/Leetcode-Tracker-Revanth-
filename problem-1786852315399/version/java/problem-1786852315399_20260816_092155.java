// Last updated: 16/08/2026, 09:21:55
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int ans = -1;
4        int min = Integer.MAX_VALUE;
5        for(int i = 0;i < drones.length;i++)
6        {
7            int x = drones[i][0];
8            int y = drones[i][1];
9            int range = drones[i][2];
10
11            int distance = Math.abs(x - target[0]) + Math.abs(y - target[1]);
12
13            if(distance <= range){
14                if(distance < min){
15                    min = distance;
16                    ans = i;
17                }
18            }
19        }
20        return ans;
21    }
22}