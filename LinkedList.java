package com.bridglabz.linklist;

public class LinkedList {
	private Node head;
	private int counter;

	public Node push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;// point to the new node
		} else {
			newNode.setNext(head);// create new node
			head = newNode;
		}
		counter++;
		return newNode;
	}

	public void print() {
		if (head == null) {
			System.out.println("Linked List is Empty");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}

		}
	}

	public void append(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
		counter++;
	}

	public void insertInBetween(Node previousNode ,Node newNode){
        Node tempNode = previousNode.next;
        previousNode.next = newNode;
        newNode.next = tempNode;
    }
}