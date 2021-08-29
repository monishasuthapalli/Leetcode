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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        diameterCompute(root);
        return diameter;
    }
    
    int diameterCompute(TreeNode currNode)
    {
        if(currNode==null)
            return 0;
        
        int leftHeight=diameterCompute(currNode.left);
        int rightHeight=diameterCompute(currNode.right);
        int tempDi=leftHeight+rightHeight;
        
        diameter=Math.max(diameter,tempDi);
        return Math.max(leftHeight,rightHeight)+1;
    }
    
}