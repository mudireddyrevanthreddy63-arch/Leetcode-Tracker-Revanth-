// Last updated: 11/08/2026, 14:14:41
class Solution {
    public int passThePillow(int n, int time) {
        int cycle = time/(n-1);
        int rs = time % (n-1);
        return cycle % 2==0 ? rs+1 : n-rs;
    }
}