/**
 * lab 4 package
 */
package ki36.Lemyk.lab4;

import java.io.FileNotFoundException;

/**
 * Class Truck implements truck
 * 
 * @author Olia Lemyk
 * @version 1.0
 */
public class Truck extends Car implements Trailer {

	private int maxCargoWeight;

	private int cargoWeight;

	/**
	 * Constructor
	 * 
	 * @throws FileNotFoundException
	 */
	Truck() throws FileNotFoundException {
		super();
		setMaxCargoWeight(0);
	}

	/**
	 * Constructor
	 * 
	 * @param engine capacity
	 * @throws FileNotFoundException
	 */
	Truck(float engineCapacity) throws FileNotFoundException {
		super(engineCapacity);
		setMaxCargoWeight(0);
	}

	/**
	 * Constructor
	 * 
	 * @param engine capacity
	 * @param number of gears
	 * @throws FileNotFoundException
	 */
	Truck(float engineCapacity, int gears) throws FileNotFoundException {
		super(engineCapacity, gears);
		setMaxCargoWeight(0);
	}

	/**
	 * Constructor
	 * 
	 * @param engine capacity
	 * @param number of gears
	 * @param number of wheels
	 * @throws FileNotFoundException
	 */
	Truck(float engineCapacity, int gears, int wheelsQuantity) throws FileNotFoundException {
		super(engineCapacity, gears, wheelsQuantity);
		setMaxCargoWeight(0);
	}

	/**
	 * Constructor
	 * 
	 * @param engine capacity
	 * @param number of gears
	 * @param number of wheels
	 * @param max    weight of cargo
	 * @throws FileNotFoundException
	 */
	Truck(float engineCapacity, int gears, int wheelsQuantity, int maxCargoWeight) throws FileNotFoundException {
		super(engineCapacity, gears, wheelsQuantity);
		setMaxCargoWeight(maxCargoWeight);
	}

	/**
	 * Setter for maxCargoWeight
	 */
	@Override
	public void setMaxCargoWeight(int weight) {
		this.maxCargoWeight = weight;
	}

	/**
	 * Getter for maxCargoWeight
	 */
	@Override
	public int getMaxCargoWeight() {
		return maxCargoWeight;
	}

	/**
	 * Method implements cargo loading
	 */
	@Override
	public void loadCargo(int weight) {
		if (weight <= maxCargoWeight - cargoWeight) {
			cargoWeight += weight;
			System.out.println("The cargo is loaded");
			super.fout.println("The cargo is loaded");
		} else {
			System.out.println("The cargo is not loaded. It's too heavy");
			super.fout.println("The cargo is not loaded. It's too heavy");
		}

	}

	/**
	 * Method implements cargo unloading
	 */
	@Override
	public void unloadCargo(int weight) {
		if (weight <= cargoWeight) {
			cargoWeight -= weight;
			System.out.println("The cargo is unloaded");
			super.fout.println("The cargo is unloaded");
		} else {
			System.out.println("Sorry, you can't do it:)");
			super.fout.println("Sorry, you can't do it:)");
		}

	}

	/**
	 * Getter for maxCargoWeight
	 */
	public int getCargoWeight() {
		return cargoWeight;
	}
	
	/**
	 * Method implements cargo weight showing
	 */
	public void viewCargoWeight() {
		System.out.println("Current weight of cargo is: " + cargoWeight);
		super.fout.println("Current weight of cargo is: " + cargoWeight);
	}

	/**
	 * Setter for maxCargoWeight
	 */
	public void setCargoWeight(int cargoWeight) {
		this.cargoWeight = cargoWeight;
	}
	
	/**
	 * Method shows truck info
	 */
	@Override
	public void info() {
		super.info();
		System.out.println("Max weight of cargo is: " + maxCargoWeight);
		super.fout.println("Max weight of cargo is: " + maxCargoWeight);
	}

}

