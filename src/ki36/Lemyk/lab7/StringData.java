/**
 * lab7 package
 */
package ki36.Lemyk.lab7;

/**
 * Class StringData implements string type of data
 * 
 * @author  Olia Lemyk
 * @version 1.0
 */
public class StringData implements Data<String> {

	private String string;

	/**
	 * Constructor
	 */
	StringData() {
		string = "";
	}

	/**
	 * Constructor
	 * 
	 * @param string
	 */
	public StringData(String string) {
		this.string = string;
	}

	/**
	 * @return the string
	 */
	public String getValue() {
		return string;
	}

	/**
	 * @param string the string to set
	 */
	public void set(String string) {
		this.string = string;
	}

	/**
	 * Method compares this NumberData with another Data
	 * 
	 * @param o - data
	 */
	@Override
	public int compareTo(Data<?> o) {
		return -1;
	}

	/**
	 * Method prints string
	 */
	@Override
	public void print() {
		System.out.println("String: " + string);
	}
}

