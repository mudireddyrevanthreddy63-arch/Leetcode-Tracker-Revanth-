// Last updated: 03/09/2026, 09:37:03
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int i =0, j=0, len = nums.length;
        int sum = 0;
        while(j <= i && i < len) {
            sum += nums[i];
            while(j<= i && sum >= target) {
                min = Math.min(min, i-j+1);
                sum -= nums[j];
                j++;
            }
            i++;
        }
        return min == Integer.MAX_VALUE? 0 : min;
    }
}