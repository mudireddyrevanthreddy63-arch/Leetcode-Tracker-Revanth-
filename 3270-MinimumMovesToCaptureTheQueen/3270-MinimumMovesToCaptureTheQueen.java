// Last updated: 11/08/2026, 14:14:05
class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if (a == e && !(c == a && between(b, d, f))) return 1;
        if (b == f && !(d == b && between(a, c, e))) return 1;
        if (Math.abs(c - e) == Math.abs(d - f)) {
            if (!(Math.abs(c - a) == Math.abs(d - b) && between(c, a, e) && between(d, b, f))) return 1;
        }
        return 2;
    }
    private boolean between(int x, int y, int z) {
        return y > Math.min(x, z) && y < Math.max(x, z);
    }
}
