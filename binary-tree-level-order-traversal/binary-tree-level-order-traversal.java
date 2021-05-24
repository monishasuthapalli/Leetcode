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
        
        
        List<List<Integer>> list = new ArrayList<>();
        if(root==null)
        {
             return list;
        }
        Deque<TreeNode> que=new ArrayDeque<>();
        
        que.add(root);
        int count=0;
        while(que.size()>0)
        {
           
            count=que.size();
            ArrayList<Integer> al=new ArrayList<>();
           
           
            for(int i=0;i<count;i++)
            {
                TreeNode node=que.remove();
                 al.add(node.val);
                if(node.left!=null)
                que.add(node.left);
                if(node.right!=null)
                que.add(node.right);
                
                
            }
              list.add(al);
        }
      
        return list;
    }
}