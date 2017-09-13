package fresh;

import sun.applet.AppletClassLoader;

public class LoaderTest {
	public static void main(String[] args) {
		System.out.println(String.class.getClassLoader());
		System.out.println(Employee123.class.getClassLoader());
		System.out.println(LoaderTest.class.getClassLoader());
		LoaderTest test = new LoaderTest();
		System.out.println(test.getClass());
		System.out.println(AppletClassLoader.class.getClassLoader());
	}
}