package Oraclejava.tutorial.oops;

/**
 * This class is used to go different types of trips.
 * 
 * @author munirathinavel
 *
 */
public class LetsGoTrip {

	public static void main(String[] args) {

		// Coorg Trip..

		// Object (Instance) Creation 
		// Class_Name Object_Name = new Class_Name();
		Coorg gomathi = new Coorg();
		gomathi.getReady("Wearing costly saree....");
		gomathi.takeMoney(6);
		gomathi.enjoy("enjoying in water games");
		gomathi.returnSafely("return safely by car...");

		Coorg vel = new Coorg();
		vel.getReady("Wear T-Shirt");
		vel.takeMoney(2000);
		vel.enjoy("Yeah... Lets Enjoy..");
		vel.returnSafely("Catch Rocket & Return Safely");

	}
}
