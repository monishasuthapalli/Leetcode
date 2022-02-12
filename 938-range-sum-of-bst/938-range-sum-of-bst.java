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
    private int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
    
        sum=0;
        findValues(root,low,high);
        
        return sum;
    }
    
    
    void findValues(TreeNode root,int low,int high)
    {
        if(root==null)
            return;
        
        if(low<=root.val&&root.val<=high)
            sum+=root.val;
        
        
        if(root.val>low)
        findValues(root.left,low,high);
        
        if(root.val<high)
        findValues(root.right,low,high);
        
        
    }
}