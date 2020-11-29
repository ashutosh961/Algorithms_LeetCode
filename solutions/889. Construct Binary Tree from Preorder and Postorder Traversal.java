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
​
    Map<Integer,Integer> map;
    int preIndex = 0;
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        
        map = new HashMap<>();
        
        for(int i=0;i<post.length;i++)
        {
            map.put(post[i], i);
        }
        
        return construct(pre,post, 0, pre.length-1);
        
    }
    
    public TreeNode construct(int[] pre, int[] post, int start, int end)
    {
        
