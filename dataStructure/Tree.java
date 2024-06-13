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

	
	public void preOrder() {
		preOrder(this.root);
	}

	private void preOrder(Node node) {
		//Raiz Esquerda Direita
		if(node == null) {
			return;
		}
		System.out.println(node.value);	
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void inOrder() {
		inOrder(this.root);
	}
	
	private void inOrder(Node node) {
		//E R D
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.println(node.value);	
		inOrder(node.right);
	}
	
	public void posOrder() {
		posOrder(this.root);
	}
	
	private void posOrder(Node node) {
		//E D R
		if(node == null) {
			return;
		}
		posOrder(node.left);
		posOrder(node.right);
		System.out.println(node.value);	
	}
	
	public void BFS() {
		//Busca em largura (por nível)
		if(this.root == null) return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(this.root);
		while(!queue.isEmpty()) {
			Node node = queue.remove();
			if(node.left != null) queue.add(node.left);
			if(node.right != null) queue.add(node.right);
			
			System.out.println(node.value);
		}
	}
	
	public void DFS() {
		//Busca em profundidade (= preOrder)
		preOrder();
	}
	
}
