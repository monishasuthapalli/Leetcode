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
    

    public int pathSum(TreeNode root, int targetSum) {
        
        List<Integer> currPath=new ArrayList<>();
        
        return leafToRootPaths(root,targetSum,currPath);
    }
    
    
    static int leafToRootPaths(TreeNode root,int targetSum,List<Integer> currPath)
    {
        if(root==null)
            return 0;
       
       currPath.add(root.val);
       int pathcount=0,pathsum=0;
        
       ListIterator<Integer> pathItr=currPath.listIterator(currPath.size());
        while(pathItr.hasPrevious())
        {
            pathsum+=pathItr.previous();
            if(pathsum==targetSum)
            {
                pathcount++;
            }
        }
     
       pathcount+=leafToRootPaths(root.left,targetSum,currPath);
       pathcount+=leafToRootPaths(root.right,targetSum,currPath);
        currPath.remove(currPath.size()-1);
        return pathcount;
        
    }
}