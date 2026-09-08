// Last updated: 08/09/2026, 09:57:38
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int localsum=0;
            for(int j=i; j<nums.length;j++){
                localsum+=nums[j];
                if(localsum==goal) count++;
                else if(localsum>goal) break;
            }
        }
        return count;
    }
}