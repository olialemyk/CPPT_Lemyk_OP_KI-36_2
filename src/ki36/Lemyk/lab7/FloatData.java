/**
 * lab7 package
 */
package ki36.Lemyk.lab7;

/**
 * Class FloatData implements numeric type of data with floating point 
 * 
 * @author  Olia Lemyk
 * @version 1.0
 */
public class FloatData implements Data<Float> {

	private Float fnumber;

	/**
	 * Constructor
	 */
	public FloatData() {

	}

	/**
	 * @return the fnumber
	 */
	public Float getValue() {
		return fnumber;
	}

	/**
	 * @param fnumber the fnumber to set
	 */
	public void set(Float fnumber) {
		this.fnumber = fnumber;
	}

	/**
	 * Constructor
	 * 
	 * @param fnumber
	 */
	public FloatData(Float fnumber) {
		this.fnumber = fnumber;
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
	 * Method prints float
	 */
	@Override
	public void print() {
		System.out.println("Float: " + fnumber);
	}

}

