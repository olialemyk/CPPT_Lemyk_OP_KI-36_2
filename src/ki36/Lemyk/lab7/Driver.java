/**
 * lab7 package
 */
package ki36.Lemyk.lab7;

/**
 * Driver class implements main method for MyDoubleLinkedList class possibilities demonstration
 * 
 * @author  Olia Lemyk
 * @version 1.0
 */
public class Driver {
		
	public static void main(String[] args) {
		MyDoubleLinkedList<? super Data<?>> list = new MyDoubleLinkedList<Data<?>>();
		list.addFirst(new StringData("A"));
		list.addFirst(new NumberData(1));
		list.addLast(new StringData("B"));
		list.addLast(new StringData("X"));
		list.removeLast();
		list.addLast(new StringData("C"));
		list.addLast(new NumberData(2));
		list.addLast(new FloatData(6.0f));
		list.addFirst(new NumberData(3));
		list.printList();
		Data<?> data = list.findMax();
		System.out.println("The greatest data is: ");
		data.print();
	}
}

