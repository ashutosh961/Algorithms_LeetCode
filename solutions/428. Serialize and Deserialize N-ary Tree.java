/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;
​
    public Node() {}
​
    public Node(int _val) {
        val = _val;
    }
​
    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
​
class Codec {
    public String serialize(Node root) {
        StringBuffer sb = new StringBuffer();
        if (root == null) {
            return sb.toString();
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node temp = queue.poll();
                sb.append(temp.val);
                sb.append(",");
                sb.append(temp.children.size());
                sb.append(",");
