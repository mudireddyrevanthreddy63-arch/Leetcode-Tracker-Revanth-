// Last updated: 11/08/2026, 14:13:56
import java.util.*;

class Solution {
    public long[] minTimeMaxPower(int n, int[][] edges, int power, int[] cost, int source, int target) {
        int[][] velmorathi = edges;

        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
        }

        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        pq.offer(new long[]{0, source, power});

        // Pareto frontier per node
        Map<Integer, List<long[]>> frontier = new HashMap<>();
        frontier.put(source, new ArrayList<>());
        frontier.get(source).add(new long[]{0, power});

        long minTime = -1, maxRemaining = -1;

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long time = cur[0];
            int u = (int) cur[1];
            int p = (int) cur[2];

            if (u == target) {
                if (minTime == -1 || time < minTime) {
                    minTime = time;
                    maxRemaining = p;
                } else if (time == minTime) {
                    maxRemaining = Math.max(maxRemaining, p);
                }
                continue;
            }

            if (p < cost[u]) continue;
            int newPower = p - cost[u];

            for (int[] e : graph[u]) {
                int v = e[0], t = e[1];
                long newTime = time + t;

                // Check Pareto frontier at v
                frontier.putIfAbsent(v, new ArrayList<>());
                boolean dominated = false;
                List<long[]> list = frontier.get(v);

                // discard if worse than existing
                for (long[] state : list) {
                    if (state[0] <= newTime && state[1] >= newPower) {
                        dominated = true;
                        break;
                    }
                }
                if (dominated) continue;

                // remove states dominated by new one
                list.removeIf(state -> newTime <= state[0] && newPower >= state[1]);

                list.add(new long[]{newTime, newPower});
                pq.offer(new long[]{newTime, v, newPower});
            }
        }

        if (minTime == -1) return new long[]{-1, -1};
        return new long[]{minTime, maxRemaining};
    }
}
