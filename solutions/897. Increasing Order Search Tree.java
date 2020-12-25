/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode temp;
    public TreeNode increasingBST(TreeNode root) {
        
        if(root == null){return root;}
        
        TreeNode ans = new TreeNode(0);
        temp  = ans;
        DFS(root);
        
        return ans.right;
    }
    
    public void DFS(TreeNode root)
    {
        if(root == null){return;}
        
        DFS(root.left);
        
        root.left = null;
        temp.right = root;
        temp = root;
        
        
        DFS(root.right);
        
    }
}
