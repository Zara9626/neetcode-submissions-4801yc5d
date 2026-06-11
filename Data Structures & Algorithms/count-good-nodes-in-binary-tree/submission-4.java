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
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    private int dfs(TreeNode node, int maxFar) {
        if (node == null) {
            return 0;
        }
        int count;

        if (node.val >= maxFar) {
            count = 1;
        } else {
            count = 0;
        }
        maxFar = Math.max(maxFar, node.val);
        count += dfs(node.left, maxFar);
        count += dfs(node.right, maxFar);
        return count;
    }
}
