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
    int pathsum=0;
    public int sumNumbers(TreeNode root) {
        
        return findRootToLeaftPathSum(root,0);
    }
    
    static int findRootToLeaftPathSum(TreeNode root, int pathsum)
    {
        
        if(root==null)
            return 0;
        pathsum=(pathsum*10)+root.val;
        
        if(root.left==null&root.right==null)
            return pathsum;
        
        else
            return findRootToLeaftPathSum(root.left,pathsum)+findRootToLeaftPathSum(root.right,pathsum);
    }
    
}