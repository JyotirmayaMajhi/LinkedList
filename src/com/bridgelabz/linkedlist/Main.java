package com.bridgelabz.linkedlist;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.push(56);
		linkedlist.push(70);
		linkedlist.push(90);
		
		linkedlist.insertAtPos(2,30);
		
		linkedlist.print();

	}

}
