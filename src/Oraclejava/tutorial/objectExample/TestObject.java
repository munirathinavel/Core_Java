package Oraclejava.tutorial.objectExample;

public class TestObject {

	public static void main(String[] args) {

		Cat tom = new Cat();
		tom.color = "black";
		tom.height = 50;
		tom.weight = 10;

		tom.makingNoise("Meow! Meow!");

		Cat kitty = new Cat();
		kitty.color = "white";
		kitty.height = 60;
		kitty.weight = 12;
		kitty.makingNoise("Meeeeeeow!");

		// Child Cat Missy
		Missy missy = new Missy();
		// Properties
		missy.price = 1000;
		// From Parent Class
		missy.color = "Yellow";
		missy.weight = 15;
		missy.height = 60;

		// Behaviour
		missy.dancing();
		// From Parent Class
		missy.makingNoise("Wow..");
		missy.biting();
		missy.running();

	}

}
