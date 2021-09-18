/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    TreeNode LCA=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        findLca(root,p,q);
        return LCA;
    }   
    
    boolean findLca(TreeNode node, TreeNode p, TreeNode q)
    {
        if(node==null)
            return false;
        
        boolean self =(node.val==p.val ||node.val==q.val);
        
        boolean left=findLca(node.left,p,q);
        if(LCA!=null)
            return true;
        boolean right=findLca(node.right,p,q);
        if(LCA!=null)
            return true;
        
        if((self&&left)||(self&&right)||(left&&right))
        {
            LCA=node;
        }
        
        return self||left||right;
    }
}