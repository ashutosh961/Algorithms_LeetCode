class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        
        if(root == null){return 0;}
        
        Queue<TreeNode> q = new LinkedList<>();
        Map<TreeNode, Integer> map = new HashMap<>();
        
        
        int width = 0;
        
        q.add(root);
        map.put(root, 0);
        
        
        while(!q.isEmpty())
        {
            
            int size = q.size();
       
            TreeNode start = null;
            TreeNode end = null;
            
            for(int i=0;i<size;i++)
            {
                
                TreeNode current = q.poll();
                int index = map.get(current);
                
                if(i == 0)
                {
                    start = current;
                }
                
                if(i == size -1)
                {
                    end = current;
                }
                
                if(current.left != null)
