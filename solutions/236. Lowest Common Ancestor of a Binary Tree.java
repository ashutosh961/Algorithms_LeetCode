/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null){return null;}
        
        
        return DFS(root,p,q);
        
    }
    
    public TreeNode DFS(TreeNode root, TreeNode p, TreeNode q)
    {
        if(root == null){return null;}
        
        if(p == root || q == root)
        {
            return root;
        }
        
        TreeNode left = DFS(root.left,p,q);
        TreeNode right = DFS(root.right,p,q);
        
        if(left != null && right != null)
        {
            return root;
        }
        if(left == null && right == null)
        {
            return null;
        }
        if(left == null)
        {
            return  right;
            
        }
        if(right == null)
        {
            return left;
        }
        return null;
    }
    
}
