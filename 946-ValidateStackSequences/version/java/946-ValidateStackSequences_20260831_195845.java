// Last updated: 31/08/2026, 19:58:45
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        if(nums.length ==1){
           return(target == nums[0])?0:-1;
        }
        while(left<=right){
            int mid = left +(right-left)/2;
            System.out.println(mid);
            if(target == nums[mid])return mid;
            else if(nums[mid]>target){
                if( nums[left]<= nums[mid] && nums[left]>target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }else{
                if( nums[right]>= nums[mid] && target> nums[right] ){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
        }
        return -1;
    }
}