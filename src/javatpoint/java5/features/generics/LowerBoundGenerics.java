package javatpoint.java5.features.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundGenerics<T> {

	private static void addToList(List<? super GrandChild> grandChild) {
		grandChild.add(new GrandChild());
		System.out.println(grandChild);
	}

	public static void main(String[] args) {

		List<SuperClass> superClassList = new ArrayList<SuperClass>();
		superClassList.add(new SuperClass());
		addToList(superClassList);

		List<Child> childClassList = new ArrayList<Child>();
		childClassList.add(new Child());
		addToList(childClassList);

		List<GrandChild> grandClassList = new ArrayList<GrandChild>();
		grandClassList.add(new GrandChild());
		addToList(grandClassList);

		List<GreatGrandChild> greatGrandChild= new ArrayList<GreatGrandChild>();
		greatGrandChild.add(new GreatGrandChild());
		//addToList(greatGrandChild);
	}

}

class SuperClass {

}

class Child extends SuperClass {
}

class GrandChild extends Child {
}

class GreatGrandChild extends GrandChild {
}
