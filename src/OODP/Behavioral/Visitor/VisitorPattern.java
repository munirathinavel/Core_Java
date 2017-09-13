package OODP.Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

// Visitor

interface Visitor {
	void visit(Customer customer);

	void visit(Item item);
}

class GeneralReport implements Visitor {
	String name;
	int price;
	int totalPrice;

	@Override
	public void visit(Customer customer) {
		name = customer.name;
	}

	@Override
	public void visit(Item item) {
		totalPrice += item.price;
	}

	public void billReport() {
		System.out.println("Customer Name=" + this.name + " & totalPrice=" + totalPrice);
	}
}

interface Visitable {
	void accept(Visitor visitor);
}

class Customer implements Visitable {
	String name;
	Visitor visitor;
	List<Item> items = new ArrayList<>();

	public Customer(String name) {
		this.name = name;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		for (Item item : items) {
			item.accept(visitor);
		}
	}

	void addItem(Item item) {
		items.add(item);
	}
}

class Item implements Visitable {
	int price;
	Visitor visitor;

	public Item(int price) {
		this.price = price;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}

public class VisitorPattern {

	public static void main(String[] args) {

		GeneralReport forum = new GeneralReport();
		Customer gomathi = new Customer("Gomathi");

		Item bag = new Item(800);
		Item watch = new Item(1200);

		gomathi.addItem(watch);
		gomathi.addItem(bag);

		gomathi.accept(forum);

		forum.billReport();
	}

}
