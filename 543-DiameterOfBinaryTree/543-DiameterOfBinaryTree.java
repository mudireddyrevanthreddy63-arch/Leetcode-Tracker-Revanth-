// Last updated: 11/08/2026, 14:17:50
class Solution {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        max=Math.max(max,getHeight(root.left)+getHeight(root.right));
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return max;

    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}