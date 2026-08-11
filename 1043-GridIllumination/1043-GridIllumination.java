// Last updated: 11/08/2026, 14:16:34
import java.util.*;

class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        Map<Integer, Integer> rowCount = new HashMap<>();
        Map<Integer, Integer> colCount = new HashMap<>();
        Map<Integer, Integer> diagCount = new HashMap<>();
        Map<Integer, Integer> antiDiagCount = new HashMap<>();
        Set<Long> activeLamps = new HashSet<>();

        
        for (int[] lamp : lamps) {
            int r = lamp[0], c = lamp[1];
            long key = ((long) r << 32) + c;
            if (activeLamps.contains(key)) continue;
            activeLamps.add(key);

            rowCount.put(r, rowCount.getOrDefault(r, 0) + 1);
            colCount.put(c, colCount.getOrDefault(c, 0) + 1);
            diagCount.put(r - c, diagCount.getOrDefault(r - c, 0) + 1);
            antiDiagCount.put(r + c, antiDiagCount.getOrDefault(r + c, 0) + 1);
        }

        int[] ans = new int[queries.length];
        int[][] dirs = {{0,0},{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};

        for (int i = 0; i < queries.length; i++) {
            int r = queries[i][0], c = queries[i][1];
            if (rowCount.getOrDefault(r,0) > 0 || colCount.getOrDefault(c,0) > 0 ||
                diagCount.getOrDefault(r-c,0) > 0 || antiDiagCount.getOrDefault(r+c,0) > 0) {
                ans[i] = 1;
            } else {
                ans[i] = 0;
            }
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                long key = ((long) nr << 32) + nc;
                if (activeLamps.contains(key)) {
                    activeLamps.remove(key);
                    rowCount.put(nr, rowCount.get(nr) - 1);
                    colCount.put(nc, colCount.get(nc) - 1);
                    diagCount.put(nr - nc, diagCount.get(nr - nc) - 1);
                    antiDiagCount.put(nr + nc, antiDiagCount.get(nr + nc) - 1);
                }
            }
        }

        return ans;
    }
}
