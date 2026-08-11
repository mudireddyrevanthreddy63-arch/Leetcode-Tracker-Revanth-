// Last updated: 11/08/2026, 14:14:14
import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = Long.MIN_VALUE;
        long prefixSum = 0;
        Map<Integer, Long> map = new HashMap<>();
        
        for (int num : nums) {
            prefixSum += num;
            if (map.containsKey(num - k)) {
                ans = Math.max(ans, prefixSum - map.get(num - k));
            }
            if (map.containsKey(num + k)) {
                ans = Math.max(ans, prefixSum - map.get(num + k));
            }
            map.put(num, Math.min(map.getOrDefault(num, Long.MAX_VALUE), prefixSum - num));
        }
        
        return ans == Long.MIN_VALUE ? 0 : ans;
    }
}
