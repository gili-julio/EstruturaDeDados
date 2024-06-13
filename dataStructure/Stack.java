package dataStructure;

public class Stack {

	private Node top;
	private int height;
	
	class Node {
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
		}
	}
	
	public Stack(int value) {
		Node newNode = new Node(value);
		this.top = newNode;
		this.height = 1;
	}
}
