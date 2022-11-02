/**
 * lab7 package
 */
package ki36.Lemyk.lab7;

/**
 * Class NumberData implements numeric type of data
 * 
 * @author  Olia Lemyk
 * @version 1.0
 */
public class NumberData implements Data<Integer> {

	private Integer number;

	/**
	 * Constructor
	 */
	public NumberData() {
		number = 0;
	}

	/**
	 * Constructor
	 * 
	 * @param number
	 */
	public NumberData(Integer number) {
		this.number = number;
	}

	/**
	 * @return the number
	 */
	public Integer getValue() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void set(Integer number) {
		this.number = number;
	}

	/**
	 * Method compares this NumberData with another Data
	 * 
	 * @param o - data
	 */
	@Override
	public int compareTo(Data<?> o) {
		if (Float.parseFloat(this.getValue().toString()) > Float.parseFloat(o.getValue().toString()))
			return 1;
		if (this.getValue().equals(o.getValue()))
			return 0;
		return -1;
	}

	/**
	 * Method prints number
	 */
	@Override
	public void print() {
		System.out.println("Number: " + number);
	}
}

