/**
 * lab7 package
 */
package ki36.Lemyk.lab7;

import java.util.LinkedList;

/**
 * Class MyDoubleLinkedList implements double-linked list
 * 
 * @author  Olia Lemyk
 * @version 1.0
 */
public class MyDoubleLinkedList<T extends Data<?>> {

	private LinkedList<T> list;

	/**
	 * Constructor
	 */
	MyDoubleLinkedList() {
		list = new LinkedList<T>();
	}

	/**
	 * Method returns the greatest data
	 * 
	 * @return Data
	 */
	public T findMax() {
		T max = null;

		for (T t : list) {
			if (t instanceof NumberData || t instanceof FloatData)
				max = t;
		}

		if (!list.isEmpty()) {
			for (T t : list)
				if (t.compareTo(max) > 0)
					max = t;
			return max;
		}

		return null;
	}

	/**
	 * Method prints all items of list
	 */
	public void printList() {
		for (T t : list)
			System.out.print(t.getValue() + " ");
		System.out.println();
	}

	/**
	 * Method prints the item of list
	 * 
	 * @param index
	 */
	public void printItem(int index) {
		System.out.println(list.get(index));
	}

	/**
	 * Method gets the item of list
	 * 
	 * @param index
	 * @return Data
	 */
	public T get(int index) {
		return list.get(index);
	}

	/**
	 * Method adds item to the beginning of list
	 * 
	 * @param t - item
	 */
	public void addFirst(T t) {
		list.addFirst(t);
	}

	/**
	 * Method adds item to the end of list
	 * 
	 * @param t - item
	 */
	public void addLast(T t) {
		list.addLast(t);
	}

	/**
	 * Method adds item to the list
	 * 
	 * @param index
	 * @param t - item
	 */
	public void add(int index, T t) {
		list.add(index, t);
	}

	/**
	 * Method removes item from the beginning of list
	 */
	public void removeFirst() {
		list.removeFirst();
	}

	/**
	 * Method removes item from the end of list
	 */
	public void removeLast() {
		list.removeLast();
	}

	/**
	 * Method removes item from the list
	 * 
	 * @param index
	 */
	public void remove(int index) {
		list.remove(index);
	}
}

