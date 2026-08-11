// Last updated: 11/08/2026, 14:19:19
class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
        return nums[0];

        int[] dp = new int[nums.length];
        int n = nums.length;
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-1] , nums[i] + dp[i-2]);
        }
        return dp[n-1];
    }
}