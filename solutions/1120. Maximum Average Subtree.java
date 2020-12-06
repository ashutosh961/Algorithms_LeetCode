 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    double  max = 0;
    public double maximumAverageSubtree(TreeNode root) {
        
        if(root == null){return 0;}
        
        DFS(root);
        
        return max;
    }
    
    public double[] DFS(TreeNode root)
    {
        
        if(root == null){return new double[]{0, 0};}
        
        
       double[] left = DFS(root.left);
       double[] right = DFS(root.right);
        
       double count = left[1] + right[1] + 1.0;
       double val = (left[0] * left[1] + right[0] * right[1] + root.val) / count;
    //   System.out.println(val);
       max = Math.max(max, val);
       return new double[]{val, count};
    }
}
