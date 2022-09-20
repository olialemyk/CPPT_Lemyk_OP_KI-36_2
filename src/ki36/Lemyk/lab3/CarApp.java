/**
 * lab 3 package
 */
package ki36.Lemyk.lab3;

import java.io.FileNotFoundException;

/**
 * CarApp class implements main method for Car class possibilities demonstration
 * 
 * @author Olia Lemyk
 * @version 1.0
 */
public class CarApp {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// Car1
		Car car1 = new Car(1.4f, 5, 4);
		car1.info();
		System.out.println("----------------");
		car1.go();
		car1.accelerate();
		car1.shiftTo(7);
		car1.stopTheCar();

		System.out.println("\n___NEXT_CAR___\n");

		// Car2
		Car car2 = new Car(6.2f, 7, 6);
		car2.info();
		System.out.println("----------------");
		car2.goReverse();
		car2.stopTheCar();
		car2.go();
		car2.shiftTo(3);
		car2.accelerate();
		car2.shiftTo(5);
		car2.stopTheCar();

		// Close print writer
		car1.dispose();
		car2.dispose();
	}
}


