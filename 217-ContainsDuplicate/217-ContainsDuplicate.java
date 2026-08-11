// Last updated: 11/08/2026, 14:19:05
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int ele: nums){
           s.add(ele);
        }
        return s.size() != nums.length;
        
    }
}