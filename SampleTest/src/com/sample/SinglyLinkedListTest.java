package com.sample;

public class SinglyLinkedListTest {

	public static void main(String[] args) {
		CustomLinkedList linkedList = new CustomLinkedList(); // creation of
																// Linked List
		linkedList.insertLast(11);
		linkedList.insertLast(21);
		linkedList.insertLast(59);
		linkedList.insertLast(14);
		linkedList.insertLast(39);

		System.out.println("Linked List Before any Operation");
		linkedList.displayLinkedList(); // display LinkedList

		linkedList.removeAllGreaterThanTargetValue(21); // delete Node
		
		System.out.println("Linked List After Removing Greater than value 21");
		linkedList.displayLinkedList(); // Again display LinkedList
		
		System.out.print("Deleted Node From Tail is: ");
		Node deletedNode = linkedList.deleteLast(); // delete Node
		deletedNode.displayNode(); // display deleted Node.
		System.out.println("\nLinked List After Removing Node from Tail");
		linkedList.displayLinkedList(); // Again display LinkedList

	}
}
