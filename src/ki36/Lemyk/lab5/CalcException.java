/**
 * lab5 package
 */
package ki36.Lemyk.lab5;

/**
 * Class CalcException implements calculation exceptions
 * 
 * @author  Olia Lemyk
 * @version 1.0
 */
 class CalcException extends ArithmeticException {
	
	/** 
	 * Constructor
	 */
	public CalcException() {
	}

	/** 
	 * Constructor
	 * 
	 * @param cause
	 */
	public CalcException(String cause) {
		super(cause);
	}
}

