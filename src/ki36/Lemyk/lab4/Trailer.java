/**
 * lab 4 package
 */
package ki36.Lemyk.lab4;

/**
 * Interface Trailer describes truck trailer
 * 
 * @author Olia Lemyk
 * @version 1.0
 */
public interface Trailer {
	
	/**
	 * Method sets max weight of cargo
	 */
	void setMaxCargoWeight(int weight);
	
	/**
	 * Method gets max weight of cargo
	 */
	int getMaxCargoWeight();

	/**
	 * Method describes max cargo loading
	 */
	void loadCargo(int weight);
	
	/**
	 * Method describes max cargo unloading
	 */
	void unloadCargo(int weight);
}

