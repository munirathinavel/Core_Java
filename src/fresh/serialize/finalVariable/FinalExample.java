package fresh.serialize.finalVariable;

class FinalExample {
	final int x ;
	FinalExample(){
		x=200;
	}
	public static void main(String[] args) {
		x = 200;// Compile Time Error
	}
}