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
    int count = 0;
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null){return root;}
        
        TreeNode res = DFS(root, p, q);
        
        return count == 2 ? res : null;
    }
    
    
    public TreeNode DFS(TreeNode root, TreeNode p, TreeNode q)
    {
        if(root == null){return root;}
        
        TreeNode left = DFS(root.left, p, q);
        TreeNode right = DFS(root.right, p, q);
        
        if(root == p || root == q)
        {
            count++;
            return root;
        }
        
        if(left != null && right != null){return root;}
        
        return left == null ? right : left;
    }
}
