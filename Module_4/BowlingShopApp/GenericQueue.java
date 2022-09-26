/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

import java.util.LinkedList;

//a generic queue named GenericQueue.
public class GenericQueue <E> {
	
	//A private generic link list data field named list
	private LinkedList<E> list = new LinkedList<>();
	
	//A public method named enqueue with a generic argument named item
	//that adds the item to the list using the addFirst method.
	public void enqueue (E item) {
		list.addFirst(item);
	}
	
	//A public method named dequeue with a generic return type
	//that removes the first object in the queue using the removeFirst method. 
	public E dequeue () {
		return list.removeFirst();
	}
	
	//A public method named size with a data return type of integer
	//that specifies the size of the list using the size method. 
	public int size () {
		return list.size();
	}
}
