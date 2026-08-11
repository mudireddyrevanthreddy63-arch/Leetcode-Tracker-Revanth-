// Last updated: 11/08/2026, 14:13:43
class Solution {
    
    private int digitRange(int num) {
        int maxDigit = 0, minDigit = 9;
        while (num > 0) {
            int d = num % 10;
            maxDigit = Math.max(maxDigit, d);
            minDigit = Math.min(minDigit, d);
            num /= 10;
        }
        return maxDigit - minDigit;
    }

    public int maxDigitRange(int[] nums) {
        int maxRange = 0;
        for (int num : nums) {
            maxRange = Math.max(maxRange, digitRange(num));
        }

        int sum = 0;
        
        for (int num : nums) {
            if (digitRange(num) == maxRange) {
                sum += num;
            }
        }
        return sum;
    }
}
