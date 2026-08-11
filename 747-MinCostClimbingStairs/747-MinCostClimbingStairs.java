// Last updated: 11/08/2026, 14:18:47
class Solution {
    Map<Integer,Integer>map=new HashMap<>();
    public int f(int n,int[]cost){
        if(map.containsKey(n))return map.get(n);
        if(n<=1)return 0;

        map.put(n, Math.min(cost[n-1]+f(n-1,cost),cost[n-2]+f(n-2,cost)));
        return map.get(n);
    }
    public int minCostClimbingStairs(int[] cost) {
        return f(cost.length,cost);
    }
}