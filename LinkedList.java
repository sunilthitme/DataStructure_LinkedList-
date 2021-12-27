package com.bridglabz.linklist;



public class LinkedList {
	private Node head;
	private int counter;

	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;// point to the new node
		} else {
			newNode.setNext(head);// create new node
			head = newNode;
		}
		counter++;
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
}