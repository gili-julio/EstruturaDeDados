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
	
	public void getTop() {
		if(this.top == null) {
			System.out.println("Pilha vazia");
		} else {
			System.out.println("Topo: " + this.top.value);
		}
	}
	
	public void getHeight() {
		System.out.println("Height: " + this.height);
	}
	
	public void print() {
		System.out.println("##############");
		Node temp = this.top;
		if(temp == null) {
			System.out.println("Pilha vazia");
		}
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println("##############");
	}

	public void push(int value) {
		Node newNode = new Node(value);
		if(this.height == 0) {
			this.top = newNode;
		} else {
			newNode.next = this.top;
			this.top = newNode;
		}
		height++;
	}
}
