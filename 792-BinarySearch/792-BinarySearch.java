// Last updated: 11/08/2026, 14:16:56
class Solution {
    public int search(int[] nums, int target) {
         int low=0,high = nums.length-1;
         while(low<=high)
         {
            int mid=(low+high)/2;
            if(nums[mid]==target)
               return mid;
            else if(nums[mid]<target)
                low =mid+1;
            else
                high = mid-1;        
         }
         return -1; 
        
    }
}