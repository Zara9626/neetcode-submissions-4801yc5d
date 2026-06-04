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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int len = 0;

        if (root== null ) return res;
        q.add(root);

        while(!q.isEmpty()) { 
            len = q.size();
            List<Integer> vals = new ArrayList<>();

            for(int i = 0 ; i< len; i++) { 
                TreeNode node = q.poll();
                vals.add(node.val);
                if(node.left != null) q.add(node.left);
                if(node.right!= null)q.add(node.right);

            }
            res.add(vals);


        }
        return res;

        


        

    }
}
