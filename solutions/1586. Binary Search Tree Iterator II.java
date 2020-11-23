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
class BSTIterator {
​
    List<Integer> list;
    int index = -1;
    public BSTIterator(TreeNode root) {
        
        list = new ArrayList<>();
        inorder(root);
    }
    
    public boolean hasNext() 
    {
        if(index < list.size()-1)
        {
            return true;
        }    
        return false;
    }
    
    public void inorder(TreeNode root)
