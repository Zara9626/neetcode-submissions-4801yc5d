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
    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;




    }
}

        //Deque<TreeNode> queue = new ArrayDeque<TreeNode>();

        //if(root!=null){
            //queue.add(root);
       // }
       // int level = 0;

       // while(!queue.isEmpty()){
          //  int len = queue.size();
           // for(int i = 0;i<len;i++){
               // TreeNode curr = queue.removeLast();

              // if(curr.right != null){
              //      queue.add(curr.right);
             //   }
               // if(curr.left !=null){
                 //   queue.add(curr.left);
              //  }
            //}
           // level++;
           
        //}
        //return root;
    
    

