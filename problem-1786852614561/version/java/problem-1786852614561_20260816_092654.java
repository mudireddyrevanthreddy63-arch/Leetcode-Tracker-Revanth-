// Last updated: 16/08/2026, 09:26:54
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) 
3    {
4      int max = 0;
5      for(int light : lights) max = Math.max(max,light);
6
7        int ans = 0;
8        for(int time : arrivalTime){
9            int r = time % period;
10            int wait;
11            if(r < max){
12                wait = 0;
13            }else{
14                wait = period - r;
15            }
16            ans = Math.max(ans, wait);
17        }
18        return ans;
19    }
20}