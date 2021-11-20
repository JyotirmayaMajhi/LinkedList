package com.bridgelabz.linkedlist;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		LinkedList linkedlist = new LinkedList();
		linkedlist.push(56);
		linkedlist.push(70);
		linkedlist.push(21);
		linkedlist.push(90);
		linkedlist.push(80);
		
//		linkedlist.insertAtPos(2,30);
		
		linkedlist.print();
		
//		System.out.println("Deleted key is : " + linkedlist.pop());
//		linkedlist.print();
//		
//		System.out.println("Deleted last key is : " + linkedlist.popLast());
//		linkedlist.print();
		
		if(linkedlist.Search_Node(21)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}
}
