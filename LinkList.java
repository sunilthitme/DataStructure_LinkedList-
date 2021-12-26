package com.bridglabz.linklist;

public class LinkList {

	public static void main(String[] args) {
		Node firstNode=new Node(56);
		Node secNode=new Node(70);
		Node thirdNode=new Node(30);
		
		Node head=firstNode;
		firstNode.next=secNode;//add second node and next of first node=secondNode Address
		secNode.next=thirdNode;//add third node and next of second node=third node address
		Node temp=head;
		while (temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;//move another node
		}
	}

}
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
	
}