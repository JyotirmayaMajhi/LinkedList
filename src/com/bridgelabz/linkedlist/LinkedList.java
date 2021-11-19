package com.bridgelabz.linkedlist;



public class LinkedList {
	Node head;
	
	private class Node{
		int key;
		Node next;
		
		public Node(int key) {
			this.key = key;
		}
		
	}

	public boolean add(int i) {
		boolean isAdded = false;
		Node newNode = new Node(i);
		if(head==null) {
			head=newNode;
			isAdded = true;
		}else {
			
			Node temp = head;
			if(temp.next!=null) {
				temp=temp.next;		
			}
			temp.next=newNode;
			isAdded = true;
		}
		return isAdded;
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
public void insertAtPos(int pos, int data) {
		
		if(pos < 1) {
			System.out.println("Invalid pos");
			return;
		}
		if(pos == 1) {
			push(data);
		}
		else {
			Node newNode = new Node(data);
			Node temp = head;
			int count = 1;
			while(count < pos-1) {
				temp = temp.next;
				count++;
			}
			Node curr = temp.next;
			temp.next = newNode;
			newNode.next = temp;
			
		}
	}
	
	public void print() {
		if(head==null) {
			System.out.println("linkedList is empty");
		}else {
			Node temp =head;
			System.out.println("LinkedList is : ");
			while(temp!=null) {
				System.out.print(temp.key + "-->");
				temp=temp.next;
			}
		}
		System.out.println();
	}
}