// Last updated: 11/08/2026, 14:14:54
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        DSU dsu = new DSU(n);
        for (int[] e : edges) dsu.union(e[0], e[1]);
        return dsu.find(source) == dsu.find(destination);
    }
    static class DSU {
        int[] parent, rank;
        DSU(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }
        int find(int x) {
            if (parent[x] != x) parent[x] = find(parent[x]);
            return parent[x];
        }
        void union(int a, int b) {
            int ra = find(a), rb = find(b);
            if (ra == rb) return;
            if (rank[ra] < rank[rb]) parent[ra] = rb;
            else if (rank[ra] > rank[rb]) parent[rb] = ra;
            else { parent[rb] = ra; rank[ra]++; }
        }
    }
}
