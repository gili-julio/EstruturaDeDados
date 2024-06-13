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
			System.out.println("Last: " + this.last.value);
		} else {
			System.out.println("Fila vazia");
		}
	}
	
	public void getLength() {
		System.out.println("Length: " + this.length);
	}
	
	public void print() {
		System.out.println("##################");
		Node temp = this.first;
		if(temp == null) {
			System.out.println("Fila vazia");
		}
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println("##################");
	}
	
	public void enqueue(int value) {
		Node newNode = new Node(value);
		if(this.length == 0) {
			this.first = newNode;
			this.last = newNode;
		} else {
			this.last.next = newNode;
			this.last = newNode;
		}
		this.length++;
	}
	
	public Node dequeue() {
		if(this.length == 0) {
			return null;
		}
		Node temp = this.first;
		if(length == 1) {
			this.first = null;
			this.last = null;
		} else {
			this.first = this.first.next;
			temp.next = null;
		}
		this.length--;
		return temp;
	}
}
