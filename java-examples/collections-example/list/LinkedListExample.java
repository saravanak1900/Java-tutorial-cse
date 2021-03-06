package cse.saravana;

//Java Program to Demonstrate
//Implementation of LinekdList
//class

//Importing required classes
import java.util.*;

//Main class
public class LinkedListExample {

	// Main driver method
	public static void main(String args[])
	{
		// Creating object of the
		// class linked list
		LinkedList<String> ll = new LinkedList<String>();

		// Adding elements to the linked list
		ll.add("A");
		ll.add("B");
		ll.add("X");
		ll.add("Y");
		System.out.println(ll);

		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");

		System.out.println(ll);

		ll.remove("B");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll);
	}
}
