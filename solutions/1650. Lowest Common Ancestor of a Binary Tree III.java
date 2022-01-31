/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/
​
class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        
        Node runner1 = p;
        Node runner2 = q;
        
        while(runner1 != runner2)
        {
            
            runner1 = (runner1 == null) ? q : runner1.parent;
            runner2 = (runner2 == null) ? p : runner2.parent;
            
        }
        
        return runner1;
    }
}
