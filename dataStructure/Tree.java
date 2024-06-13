package dataStructure;

import java.util.Queue;
import java.util.LinkedList;

public class Tree {

	private Node root;
	
	public class Node{
		public int value;
		
		public Node left;
		public Node right;
		
		public Node(int value) {
			this.value = value;
		}
		
		public boolean isLeaf() {
			return (this.left == null) && (this.right == null);
		}
	}
	
	public void insert(int value) {
		if(this.root == null) {
			this.root = new Node(value);
		} else {
			Node newNode = new Node(value);
			Queue<Node> queue = new LinkedList<>();
			queue.add(this.root);
			while(queue.size() > 0) {
				Node currentNode = queue.remove();
				if(currentNode.left == null) {
					currentNode.left = newNode;
					break;
				} else {
					queue.add(currentNode.left);
				}
				if(currentNode.right == null) {
					currentNode.right = newNode;
					break;
				} else {
					queue.add(currentNode.right);
				}
			}
		}
	}

	
}
