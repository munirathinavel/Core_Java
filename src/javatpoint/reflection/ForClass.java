package javatpoint.reflection;

class Sample {
	int a = 50;

	void print() {
		System.out.println("This is sample class method...");
	}

	int returnInt() {
		return Integer.MAX_VALUE;
	}
}

interface My{}  

class Sample2 {

	Class returnSample(Object obj) {
		Class c = obj.getClass();
		System.out.println(c.getName());
		Sample sample;
		try {
			sample = (Sample) c.newInstance();
			System.out.println(sample.a);
			sample.print();
			System.out.println(sample.returnInt());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

}

public class ForClass {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class<?> c = Class.forName("javatpoint.reflection.Sample");
			System.out.println(c.getName());
			System.out.println(c.getModifiers());
			System.out.println(c.isArray());
			System.out.println(c.isLocalClass());
			System.out.println(c.isInterface());

			Sample sample = (Sample) c.newInstance();
			System.out.println(sample.a);
			System.out.println(sample.returnInt());

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

		Sample s = new Sample();
		Sample2 sample2 = new Sample2();
		sample2.returnSample(s);

		Class c = int.class;
		System.out.println(c.getName());
		System.out.println(c.isPrimitive());
		
		Class c1 = Boolean.class;
		System.out.println(c1.getName());

		Class c2 = ForClass.class;
		System.out.println(c2.getName());
		
		System.out.println(c2.isArray());
		System.out.println(c2.isLocalClass());
		System.out.println(c2.isInterface());
		
		Class iClass = Class.forName("javatpoint.reflection.My");
		
	}

}
