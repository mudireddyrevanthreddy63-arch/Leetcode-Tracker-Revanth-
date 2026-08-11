// Last updated: 11/08/2026, 14:13:52
import java.util.Arrays;

class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums); 
        int n = nums.length;
        long sum = 0;
        
        
        for (int i = n - 1; i >= n - k; i--) {
            int val = nums[i];
            if (mul > 1) {
                sum += (long) val * mul;
            } else {
                sum += val;
            }
            mul--; 
        }
        
        return sum;
    }
}
