package OODP.Behavioral.Itererator;

interface IIterator {
	boolean hasNext();

	Object next();
}

interface IContainer {
	IIterator createIterator();
}

class BooksContainer implements IContainer {

	String[] booksCollection = { "Book-1", "Book-2", "Book-3", "Book-4", "Book-5", "Book-6" };

	@Override
	public IIterator createIterator() {

		return new BooksIterator();
	}

	private class BooksIterator implements IIterator {
		int position;

		@Override
		public boolean hasNext() {
			if (position < booksCollection.length) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public Object next() {
			if (hasNext()) {
				return booksCollection[position++];
			} else {
				return null;
			}
		}
	}
}

public class IteratorDesignPatternExample {
	public static void main(String[] args) {
		BooksContainer container = new BooksContainer();
		IIterator iterator = container.createIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
