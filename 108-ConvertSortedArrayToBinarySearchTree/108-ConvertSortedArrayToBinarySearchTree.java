// Last updated: 11/08/2026, 14:20:06
class Solution {

    TreeNode helper(List <Integer> nums, int l, int r) {
        if (l > r) {
            return null;
        }
    
        int mid = (l + r) / 2;
        return new TreeNode(nums.get(mid),
                helper(nums, l, mid - 1),
                helper(nums, mid + 1, r));
                }

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(Arrays.stream(nums).boxed().collect(Collectors.toList()), 0, nums.length -1);
    }
}