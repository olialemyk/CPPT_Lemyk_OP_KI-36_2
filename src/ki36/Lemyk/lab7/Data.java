/**
 * lab7 package
 */
package ki36.Lemyk.lab7;

/**
 * Interface Datar describes rules for data type
 * 
 * @author Olia Lemyk
 * @version 1.0
 */
interface Data<T> {
	/**
	 * Method prints data
	 */
	public void print();
	
	/**
	 * Method returns data
	 */
	public T getValue();
	
	/**
	 * Method compares current Data with another Data
	 * 
	 * @param Data
	 */
	public int compareTo(Data<?> d);
}

