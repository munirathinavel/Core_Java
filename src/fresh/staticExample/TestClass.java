package fresh.staticExample;

import java.util.ArrayList;
import java.util.List;

class MyClass {

    public static List<String> cars = new ArrayList<String>();

    static {
        cars.add("Ferrari");
        cars.add("Scoda");
    }

}


public class TestClass {

    public static void main(String args[]) {
        System.out.println(TestClass.cars.get(0));  //This will print Ferrari
    }
}
