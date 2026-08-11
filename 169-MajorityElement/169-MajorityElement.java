// Last updated: 11/08/2026, 14:22:45
class Solution {
    public int majorityElement(int[] nums) {
        int n=0,c=0;
        for(int i=0;i<nums.length;i++)
        {
           if(c==0)
           n=nums[i];
           if(n==nums[i])
           {
               c++;
           }else
           c--;
        }
        return n;
    }
}