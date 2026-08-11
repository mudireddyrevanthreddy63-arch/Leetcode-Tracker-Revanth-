// Last updated: 11/08/2026, 14:19:52
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> l = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return l;
    }
    void preOrder(TreeNode root){
        if(root==null)
          return;
        l.add(root.val);   
        preOrder(root.left);
        preOrder(root.right);
             
    }
}