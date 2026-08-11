// Last updated: 11/08/2026, 14:19:00
class Solution {
    public TreeNode invertTree(TreeNode root) {
        System.out.println("here");
        if(root==null) return root;

        TreeNode temp = invertTree(root.right);
        root.right = invertTree(root.left);
        root.left = temp;

        return root;
    }
}