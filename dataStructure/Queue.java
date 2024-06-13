package dataStructure;

public class Queue {

	private Node first;
	private Node last;
	private int length;
	
	public class Node {
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
		}
	}
	
	public Queue(int value) {
		Node newNode = new Node(value);
		this.first = newNode;
		this.last = newNode;
		this.length++;
	}
	
	public void getFirst() {
		if(this.first != null) {
			System.out.println("First: " + this.first.value);
		} else {
			System.out.println("Fila vazia");
		}
	}
	
	public void getLast() {
		if(this.last != null) {
			System.out.println("First: " + this.last.value);
		} else {
			System.out.println("Fila vazia");
		}
	}
	
	
}
