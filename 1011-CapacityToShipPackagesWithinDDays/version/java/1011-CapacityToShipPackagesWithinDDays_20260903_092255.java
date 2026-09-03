// Last updated: 03/09/2026, 09:22:55
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int sum=0;
4        for(int i=0;i<nums.length;i++){
5            if(i%2==0){
6                sum+=nums[i];
7            }
8            else{
9                sum-=nums[i];
10            }
11        }
12        return sum;
13    }
14}