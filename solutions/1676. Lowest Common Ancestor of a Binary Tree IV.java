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
    
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode[] nodes) {
        
        Set<TreeNode> set = new HashSet<>();
        
        for(int i=0;i<nodes.length;i++)
        {
            set.add(nodes[i]);
        }
        
        return DFS(root, set); 
        
    }
    
    public TreeNode DFS(TreeNode root, Set<TreeNode> set)
    {
        
        if(root == null)
        {
            return null;
        }
                
        if(set.contains(root))
        {
            return root;
        }
        
        TreeNode left = DFS(root.left, set);
        TreeNode right = DFS(root.right, set);
        
        if(left == right){return null;}
        
        if(left != null && right != null)
        {
            return root;
        }        
        return left == null ? right : left;
    }
    
    
}
