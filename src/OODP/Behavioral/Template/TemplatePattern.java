package OODP.Behavioral.Template;

// Template Method Implementation
abstract class CrossCompiler {
	final void crossCompiler() {
		System.out.println("Initiate Compilation process..");
		collectSource();
		compileSource();
		System.out.println("Compilation completed!\n");
	}

	abstract void collectSource();

	abstract void compileSource();
}

// Concrete Implementation -1
class AndroidPhone extends CrossCompiler {
	@Override
	protected void collectSource() {
		System.out.println("Collecting Source for Android..");
	}

	@Override
	protected void compileSource() {
		System.out.println("Collecting Source for Android..");
	}
}

// Concrete Implementation -2
class IPhone extends CrossCompiler {
	@Override
	protected void collectSource() {
		System.out.println("Collecting Source for IPhone..");
	}

	@Override
	protected void compileSource() {
		System.out.println("Collecting Source for IPhone..");
	}
}

public class TemplatePattern {
	public static void main(String[] args) {
		CrossCompiler iPhone = new IPhone();
		iPhone.crossCompiler();

		CrossCompiler android = new AndroidPhone();
		android.crossCompiler();
	}
}
