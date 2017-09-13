package Oraclejava.tutorial.oops;

public class Coorg implements Trip{

	@Override
	public void getReady(String thingsToGetReady) {
		System.out.println(thingsToGetReady);
	}

	@Override
	public void takeMoney(int money) {
		System.out.println("take "+money+" rupees...");
	}

	@Override
	public void enjoy(String enjoy) {
		System.out.println(enjoy);
	}

	@Override
	public void returnSafely(String safeReturn) {
		System.out.println(safeReturn);
	}

}
