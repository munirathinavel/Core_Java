package QandA;

class staticClass {
	static void m1() {

	}
}

class staticClass2 extends staticClass {
	static int  i;
	static void m1() {
		i = 16; // only static members are accessible
	}
}

final class C1 {
	
}
public class StaticTest1 {

}
