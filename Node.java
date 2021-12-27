package com.bridglabz.linklist;

public class Node {
	public int data;
    public Node next;

    public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

