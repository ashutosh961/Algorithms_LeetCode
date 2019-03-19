/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class BSearch {

	/**
	 * @param args
	 */
	
	public static class Node{
		
		int data;
		Node left;
		Node right;
		int count=1;
		public Node(int key) {
			
			data = key;
			left = right=null;
		}
		
	}
	
	Node root;
	
	
	public int  findlargest(Node root) {
		  int count=0;
		  int leftmax=0;
		  int rightmax = 0;
		  int resultdata=0;
		if(root!=null)
		{
			try{
		{    resultdata=root.data;
			 rightmax = findlargest(root.right);
			 leftmax  =  findlargest(root.left);
		}  System.out.println(root.data);
			}catch(Exception e) {}
		
		if(rightmax>resultdata) {
			
			resultdata =  rightmax;
		}
		else if(leftmax>resultdata){
			
			resultdata =  leftmax;
		}
	
	}
		 return resultdata;	}
	
	
	public void displaytreeInOrder(Node root) {
		
		if(root!=null) {
			
			displaytreeInOrder(root.left);
			System.out.println(root.data+"("+root.count+")"+"->");
			displaytreeInOrder(root.right);
			
			
		}
		
		
		
	}
	
	
	public int maxdepth(Node root) {
		
		int leftdepth,rightdepth;
		
		
		if(root==null) {
			
			return 0;
		}
		
		else {
			
			leftdepth  = maxdepth(root.left);
			rightdepth = maxdepth(root.right);
			
			if(leftdepth>rightdepth) {
				
				return 1+leftdepth;
			}
			else {
				
				return 1+rightdepth;
			}
		}
		
		
		
		
	}
	
	public Node insert(Node root,int data) {
		
		
		if(root==null) {
			
			Node node = new Node(data);
		 //   node.data = data;
		    return node;
		}
		
		else {
			
			if(data<root.data) {
				
				root.left= insert(root.left,data);
				
			}else if(data>root.data)
			{
				
				root.right = insert(root.right,data);
			}
			
			else if(data==root.data) {
				
				root.count++;
			}
			
			
		}
		
		
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node root = null;
		BSearch Tree = new BSearch();
		BSearch Tree3 = new BSearch();
		
		
		
		
	    root =Tree.insert(root,10);
	    Tree.insert(root,10);
	    Tree.insert(root,30);
	    Tree.insert(root,40);
	    Tree.insert(root,50);
	    Tree.insert(root,60);
	    Tree.insert(root,70);
	    System.out.println("Tree 1");
	    Tree.displaytreeInOrder(root);
		//int maxdepth = Tree.maxdepth(root);
		//System.out.println("MaxDepth:"+maxdepth);
		//int largest=Tree.findlargest(root);
		//System.out.println("Largest:"+largest);
		Tree3 =Tree;
		System.out.println("Tree 3:");
		Tree3.displaytreeInOrder(root);
		
	}

}
