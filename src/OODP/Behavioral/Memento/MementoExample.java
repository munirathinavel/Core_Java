package OODP.Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

// CareTaker
class EditorCaretaker {
	List<EditorMemento> mementos = new ArrayList<>();

	void addMemento(EditorMemento memento) {
		mementos.add(memento);
	}

	EditorMemento get(int index) {
		return mementos.get(index);
	}
}

// Concrete Memento
class EditorMemento {
	String editorContent;

	public EditorMemento(String editorContent) {
		this.editorContent = editorContent;
	}

	public String getState() {
		return editorContent;
	}
}

// Originator

class Editor {
	String contents;

	EditorMemento setMemento() {
		return new EditorMemento(contents);
	}

	String getContents() {
		return contents;
	}

	void setContents(String contents) {
		this.contents = contents;
	}

	void getMemento(EditorMemento memento) {
		contents = memento.editorContent;
	}
}

public class MementoExample {
	public static void main(String[] args) {
		EditorCaretaker caretaker = new EditorCaretaker();
		// EditorMemento memento = new
		Editor editor = new Editor();
		editor.setContents("State-1");
		caretaker.addMemento(editor.setMemento());
		System.out.println(editor.getContents());

		editor.setContents("State-2");
		caretaker.addMemento(editor.setMemento());
		System.out.println(editor.getContents());

		editor.setContents("State-3");
		caretaker.addMemento(editor.setMemento());
		System.out.println(editor.getContents());

		editor.getMemento(caretaker.get(0));
		System.out.println(editor.getContents());

		editor.getMemento(caretaker.get(2));
		System.out.println(editor.getContents());
	}

}
