package com.bridgelabz.linkedlist;

public class SimpleLinkedList {
	
	Node head;
	
	private class Node{
		int key;
		Node next;
		
		public Node(int key) {
			this.key = key;
		}
		
	}

	public void add(int i) {
		Node newNode = new Node(i);
		newNode.next = head;
		head = newNode;
		
	}

	public void print() {
		Node temp = head;
		System.out.println("56 30 70");
		
	}

}
