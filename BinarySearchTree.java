/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
import java.util.*;

public class BinarySearchTree {

	/**
	 * @param args
	 */
public	ArrayList inorderlist = new ArrayList();
public	ArrayList preorderlist = new ArrayList();
public int leftdepth,rightdepth;
	class Node
	{	
		int data;
		Node left;
		Node right;
		Node next;
		
		public Node(int key) {
			data=key;
			left=right=null;
			next=null;
		}	
	}
	
	
	
  static class LinkedNode
	{	
		int data;
		LinkedNode next;
		
		public LinkedNode() {
			next=null;
		}	
	}
	
	
	Node root;
	LinkedNode linkednode;
	
	public void insert(int data) {
	root = insertrecord(root,data);
	}
	
	public Node insertrecord(Node root,int data) {
	
		if(root==null) {
			
			root = new Node(data);
			return root;
			
		}
		
		else {
			
			
			if(data<root.data) {
				root.left = insertrecord(root.left,data);
			}
			
			else {
				root.right = insertrecord(root.right,data);
			}
		}
		return root;
	}
	
	
	public void Inorder() {
		
		inorder(root);
	}
	
  void AddtoLinkedList(int data) {
		  

        if(linkednode==null) {
        	
        	linkednode = new LinkedNode();
        	linkednode.data=data;
        	linkednode.next=null;
        }	
        else {
        	
        	LinkedNode temp=new LinkedNode();
        	temp.data=data;
        	temp.next=linkednode;
        	linkednode=temp;
        	
        	
        }
		  		  
	  }
  
  
  void displaylinkedlist() {
	  
	  while(linkednode!=null) {
		  try {
		  System.out.println("->"+linkednode.data);
		  linkednode = linkednode.next;		  
		  }catch(Exception e ) {} }
	  
  }
  
  
  public int  minvaluesuccessor(Node root) {
	  
	  int minval=root.data;
	  
	  while(root.left!=null) {
		  
		  minval = root.left.data;
		  root = root.left;
		  
	  }
	  
	  return minval;
  }
  
  public void Delete(int data) {
	  
	  DeleteUtil(root,data);
  }
  
  public Node DeleteUtil(Node root,int data) {
	  
	  if(root==null) {
		  System.out.println("No element to delete");
	  }
	  
	  if(data < root.data) {
		  
		  root.left = DeleteUtil(root.left,data);
	  }
	  
	  else  if(data > root.data) {
		  root.right = DeleteUtil(root.right,data);
	  }
	  
	  else {
		  
		  if(root.left == null) {
			  return root.right;
		  }
		  
		  if(root.right == null) {
			  
			  return root.left;
			  
		  }
		  
		  root.data = minvaluesuccessor(root.right);
		  root.right = DeleteUtil(root.right,root.data);
		  
		  
	  }
	  
	  
	  
	  
	  return root;
  }
	
	
	
	public void inorder(Node root) {
		
		if(root!=null) {
			
			inorder(root.left);
			inorderlist.add(root.data);
			AddtoLinkedList(root.data);
			System.out.println(root.data);
			//inorderlist.add(root.data);
			inorder(root.right);
		}
	}
	
public void Preorder() {
		
		Preorder(root);
	}

public void maxdepthcallutil() {
	
	maxdepthcall(root);
}


public int maxdepthcall(Node root) {
	int leftdepth=0,rightdepth=0;
	if(root!=null) 
	{
		 leftdepth = maxdepthcall(root.left);
		 rightdepth = maxdepthcall(root.right);
		 }
		
	if(root==null) {
		return 0;
	}
	
	if(leftdepth>rightdepth) {
		
		return leftdepth+1;
	}
	else if (rightdepth>leftdepth) {
		
		return rightdepth+1;
	}
	return 0;
}

public void Preorder(Node root) {
	
	if(root!=null) {
		preorderlist.add(root.data);
		System.out.println(root.data);
		Preorder(root.left);
		Preorder(root.right);
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		BinarySearchTree bs = new BinarySearchTree();
		//BinarySearchTree bs1 = new BinarySearchTree();
		
		bs.insert(50);
		bs.insert(30);
		bs.insert(20);
		bs.insert(40);
		bs.insert(70);
		bs.insert(60);
		bs.insert(80);
	   // bs.Delete(40);
		bs.maxdepthcallutil();	
		
	/*	bs1.insert(130);
		bs1.insert(150);
		bs1.insert(160);
		bs1.insert(200);
		bs1.insert(210);
		bs1.insert(220);
		bs1.insert(120);*/
		
	//	System.out.println("Inorder\n");
		//bs.Inorder();
	
		//System.out.println(Height);
		//System.out.println("Preorder\n");
		//bs.Preorder();
	
	 
	//	System.out.println(Arrays.deepToString(bs.inorderlist.toArray()));
		//System.out.println("Printing LinkedList");
		//bs.displaylinkedlist();
     	
	   // System.out.println(depth);	
	}

}
