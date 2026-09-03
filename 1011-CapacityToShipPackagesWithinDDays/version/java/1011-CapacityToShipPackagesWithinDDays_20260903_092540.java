// Last updated: 03/09/2026, 09:25:40
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int left = 0, right = numbers.length - 1;
4        while (left < right) {
5            int sum = numbers[left] + numbers[right];
6            if (sum == target) {
7                return new int[]{left + 1, right + 1}; 
8            } else if (sum < target) {
9                left++;
10            } else {
11                right--;
12            }
13        }
14        return new int[]{-1, -1}; 
15    }
16}
17