// Last updated: 03/09/2026, 09:21:12
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int lo = 0, hi = 0;
4        for (int w : weights) {
5            lo = Math.max(lo, w); // must fit largest package
6            hi += w;              // sum of all weights
7        }
8        
9        while (lo < hi) {
10            int mid = lo + (hi - lo) / 2;
11            if (canShip(weights, days, mid)) {
12                hi = mid;
13            } else {
14                lo = mid + 1;
15            }
16        }
17        return lo;
18    }
19    
20    private boolean canShip(int[] weights, int days, int cap) {
21        int usedDays = 1, load = 0;
22        for (int w : weights) {
23            if (load + w > cap) {
24                usedDays++;
25                load = 0;
26            }
27            load += w;
28            if (usedDays > days) return false;
29        }
30        return true;
31    }
32}
33