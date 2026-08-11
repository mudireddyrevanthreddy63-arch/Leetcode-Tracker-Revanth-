// Last updated: 11/08/2026, 14:18:48
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }
}