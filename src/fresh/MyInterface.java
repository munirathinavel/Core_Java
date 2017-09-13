package fresh;

import java.util.Spliterator;

public interface MyInterface {

	int i=45;
	String a="2343";
	default Spliterator spliterator() {
        return null;
    }
	
	
}
	