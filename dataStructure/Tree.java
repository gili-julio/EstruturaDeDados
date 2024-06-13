package dataStructure;

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

	
}
