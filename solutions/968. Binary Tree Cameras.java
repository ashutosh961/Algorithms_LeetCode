 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans;
    Set<TreeNode> points;
    public int minCameraCover(TreeNode root) {
        
        points = new HashSet<>();
        
        points.add(null);
        DFS(root, null);
        
        return ans;
    }
    
    public void DFS(TreeNode root, TreeNode parent)
    {
        if(root == null){return;}
        
        DFS(root.left, root);
        DFS(root.right, root);
            
        if(parent == null && !points.contains(root) || !points.contains(root.left) || !points.contains(root.right))
        {
            ans++;
            points.add(root.left);
            points.add(root.right);
            points.add(parent);
            points.add(root);
        }
        
        
        
    }
}
