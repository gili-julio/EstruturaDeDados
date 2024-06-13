package dataStructure;

public class LinkedList {
	
	//.getHead() = imprime a cabeça da lista
	//.getTail() = imprime a calda da lista
	//.getLength() = imprime o tamanho da lista
	//.makeEmpty() = tira as referencias da head e tail da lista (deixando a lista vazia)
	//.print() = imprime nó por nó da lista
	//.append("exemplo") = adiciona "exemplo" como o nó final da lista
	//.removeLast() = remove o último nó da lista
	//.prepend("exemplo") = adiciona "exemplo" como o nó inicial da lista
	//.removeFirst() = remove o primeiro nó da lista
	//.get(index) = retorna o nó na posição index
	//.insert(index, "exemplo") = adiciona "exemplo" na posição index, movendo o nó index para index+1,
	//  retornando true se der certo e false se der algum problema
	//.set(index, "exemplo") = troca o valor do nó na posição index para "exemplo",
	//  retornando true se der certo e false se der algum problema
	//.remove(index) = remove e retorna o nó na posição index

	private Node head;
	private Node tail;
	private int length;
	
	public class Node {
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
		}
	}
	
	public LinkedList(String data) {
		length = 1;
		Node newnode = new Node(data);
		head = newnode;
		tail = newnode;
	}
	
	public void getHead() {
		if(this.head == null) {
			System.out.println("Lista vazia");
		} else {
			System.out.println("Head: " + this.head.data);
		}
	}
	
	public void getTail() {
		if(this.tail == null) {
			System.out.println("Lista vazia");
		} else {
			System.out.println("Tail: " + this.tail.data);
		}
	}
	
	public void getLength() {
		System.out.println("Length: " + this.length);
	}
	
	public void makeEmpty() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public void print() {
		Node temp = this.head;
		System.out.println("##################");
		if(temp == null) {
			System.out.println("Lista vazia");
		}
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println("##################");
	}
	
	public void append(String data) {
		Node newNode = new Node(data);
		if(this.length == 0) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail.next = newNode;
			this.tail = newNode;
		}
		this.length++;
	}
	
	public Node removeLast() {
		if(this.length == 0) {
			return null;
		}
		Node pre = this.head;
		Node temp = null;
		
		while(pre.next != this.tail) {
			pre = pre.next;
		}
		
		temp = this.tail;
		this.tail = pre;
		this.tail.next = null;
		this.length--;
		if(this.length == 0) {
			this.head = null;
			this.tail = null;
		}
		
		return temp;
	}
	
	public void prepend(String data) {
		Node newNode = new Node(data);
		if(this.length == 0) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			newNode.next = this.head;
			this.head = newNode;
		}
		this.length++;
	}
	
	public Node removeFirst() {
		if(length == 0) {
			return null;
		}
		Node temp = this.head;
		this.head = this.head.next;
		temp.next = null;
		this.length--;
		if(this.length == 0) {
			this.head = null;
			this.tail = null;
		}
		return temp;
	}
	
	public Node get(int index) {
		if( index < 0 || index >= this.length) {
			return null;
		}
		Node temp = this.head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public boolean insert(int index, String data) {
		if(index < 0 || index > this.length) {
			return false;
		}
		if(index == 0) {
			prepend(data);
			return true;
		}
		if(index == this.length) {
			append(data);
			return true;
		}
		
		Node newNode = new Node(data);
		Node temp = get(index-1);
		newNode.next = temp.next;
		temp.next = newNode;
		this.length++;
		return true;
	}
	
	public boolean set(int index, String data) {
		Node temp = get(index);
		if(temp != null) {
			temp.data = data;
			return true;
		}
		return false;
	}
	
	public Node remove(int index) {
		if(index < 0 || index >= length) {
			return null;
		}
		if(index == 0) {
			return removeFirst();
		}
		if(index == this.length - 1) {
			return removeLast();
		}
		
		Node prev = get(index-1);
		Node temp = prev.next;
		
		prev.next = temp.next;
		temp.next = null;
		this.length--;
		
		return temp;
	}
}
