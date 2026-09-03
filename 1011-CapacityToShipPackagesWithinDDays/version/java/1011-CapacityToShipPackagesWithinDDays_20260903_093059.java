// Last updated: 03/09/2026, 09:30:59
1class Solution {
2    public int compareVersion(String version1, String version2) {
3        String[] v1 = version1.split("\\.");
4        String[] v2 = version2.split("\\.");
5        int n = Math.max(v1.length, v2.length);
6        
7        for (int i = 0; i < n; i++) {
8            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
9            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
10            if (num1 < num2) return -1;
11            if (num1 > num2) return 1;
12        }
13        return 0;
14    }
15}
16