// Last updated: 11/08/2026, 14:20:51
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0; // pointer for valid elements
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i; // number of elements not equal to val
    }
}