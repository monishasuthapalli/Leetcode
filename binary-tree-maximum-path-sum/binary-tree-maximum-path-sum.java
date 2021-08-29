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
    int globalMaxSum=0;
    public int maxPathSum(TreeNode root) {
        globalMaxSum=Integer.MIN_VALUE;
        maxSumCompute(root);
        return globalMaxSum;
    }
    
    int maxSumCompute(TreeNode currNode)
    {
        if(currNode==null)
            return 0;
        int maxLeft=maxSumCompute(currNode.left);
        int maxRight=maxSumCompute(currNode.right);
        
        
        maxLeft=Math.max(maxLeft,0);
        maxRight=Math.max(maxRight,0);
        
        int tempmaxSum=maxLeft+maxRight+currNode.val;
        globalMaxSum=Math.max(tempmaxSum,globalMaxSum);
        
        return Math.max(maxLeft,maxRight)+currNode.val;
    }
}