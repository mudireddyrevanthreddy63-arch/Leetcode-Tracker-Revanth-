// Last updated: 03/09/2026, 09:28:53
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int cameras = 0;
18    
19    public int minCameraCover(TreeNode root) {
20        if (dfs(root) == 0) {
21            cameras++;
22        }
23        return cameras;
24    }
25    
26    private int dfs(TreeNode node) {
27        if (node == null) return 2; 
28        
29        int left = dfs(node.left);
30        int right = dfs(node.right);
31        
32        if (left == 0 || right == 0) {
33            cameras++;
34            return 1; 
35        }
36        if (left == 1 || right == 1) {
37            return 2; 
38        }
39        return 0; 
40    }
41}
42