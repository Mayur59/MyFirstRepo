package com.mayur.binary;
import java.util.Optional;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BinaryTree {

	
	LinkedList n=new LinkedList();
	Node root;
	int temp = 0;
	List l = new ArrayList();

	void add(int data) {
		root = addRecursive(root, data);

	}

	public Node addRecursive(Node current, int data) {

		if (current == null) {
			return new Node(data);
		} else if (data < current.data) {
			current.left = addRecursive(current.left, data);

		} else if (data > current.data) {
			current.right = addRecursive(current.right, data);
		} else {
			return current;
		}
		return current;

	}

	public boolean containsNode(int value) {
		return containsNodeRecursive(root, value);
	}

	private boolean containsNodeRecursive(Node current, int value) {

		if (current == null) {
			return false;
		}
		if (value == current.data) {
			return true;
		}
		return value < current.data ? containsNodeRecursive(current.left, value)
				: containsNodeRecursive(current.right, value);
	}

	public void traverseInOrder(Node n) {

		if (n != null) {
			traverseInOrder(n.left);

			System.out.print(n.data + " ");
			traverseInOrder(n.right);
		}
	}

	public void traversePreOrder(Node n) {

		// System.out.print(n.data+" ");
		if (n != null) {
			System.out.print(n.data + " ");
			traversePreOrder(n.left);

			// System.out.print(n.data + " ");
			traversePreOrder(n.right);
			// System.out.println(n.data);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Optional<Node> empty=	 Optional.empty();  
	System.out.println(empty);
		int a = 0;
		BinaryTree b = new BinaryTree();
		b.add(6);
		b.add(4);
		b.add(8);
		b.add(3);
		b.add(5);
		b.add(7);
		b.add(9);

		boolean found = b.containsNode(8);
		if (found) {
			System.out.println("data is found");
		} else {
			System.out.println("data is not found");
		}
		System.out.println("binary tree travsal InOrder is as follows");
		b.traverseInOrder(b.root);
		System.out.println();
		System.out.println("binary tree travsal PreOrder is as follows");
		b.traversePreOrder(b.root);
		System.out.println();

		System.out.println("binary tree travsal PostOrder is as follows");
		b.traversePostOrder(b.root);
		System.out.println("BFT travesal");
		b.bft();
		b.delete(6);
	//	b.delete(4);
	 //b.delete(b.root);

	}
	

	private void traversePostOrder(Node n) {
		if (n != null) {
			traversePostOrder(n.left);

			traversePostOrder(n.right);
			System.out.print(n.data + " ");
		}

	}
		private void deleteAll(Node n) {
			
			if(n!=null) {
				deleteAll(n.left);
				deleteAll(n.right);
				System.out.println("element which are removing="+n.data);
				n=null;
				
			}
			else {
				System.out.println("tree is empty now");
			}
		}
		
		private Node deleteValue(Node current, int data) {
			
			 if (current == null) {
			        return current;
			    }

			 else if (data == current.data) {
				 
				 if(current.left ==null & current.right ==null) {
					 return null;
					 
				 }
				 
				  else  if  (current.left ==null){
		                return current.right;
		            }
		            else if(current.right == null){
		                return current.left;
		            }
			    	int smallestValue = findSmallestValue(current.right);
			    	current.data = smallestValue;
			    	current.right = deleteValue(current.right, smallestValue);
			    	return current;
			    } 
			 else  if (data < current.data) {
			        current.left = deleteValue(current.left, data);
			        return current;
			    }
			 else {
				
			    current.right = deleteValue(current.right, data);
			    return current;
			 }
			
		}
		
		private int findSmallestValue(Node root) {
		    return root.left == null ? root.data : findSmallestValue(root.left);
		}
		
		
		public void delete(int value) { 
		    root = deleteValue(root, value);
		    System.out.println();
		    traverseInOrder(root);
		}
		
		 public void bft( ) {
			 Queue<Node> nodes= new LinkedList<Node>();
			if(root==null) {
				return;
			}
			
			
				nodes.add(root);
			
			System.out.println("size="+nodes.size());
			 
			 while(!nodes.isEmpty()) {
					System.out.println("size="+nodes.size());
				 Node node=nodes.remove();
				 System.out.println("size="+nodes.size());
				 
				 System.out.print(node.data+" ");
				 
				 if(node.left!=null) {
					 nodes.add(node.left);
				 }
				 
				 if(node.right!=null) {
					 nodes.add(node.right);
				 }
			 }
			
			 
			
			 
		}
		

}
