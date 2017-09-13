package javatpoint.java5.features;

enum direction {
	east, west, south, north; // ; is optional
};

enum Season {
	summer(4), winter(3), spring(2), fall(3);

	int value;

	Season(int value) {
		this.value = value;
	}
}

public class EnumEx1 {

	public static void main(String[] args) {
		for (direction d : direction.values()) {
			System.out.println(d);
		}

		System.out.println(direction.east);

		for (Season s : Season.values()) {
			System.out.println(s + " ==>>" + s.value);
		}

		Season season = Season.fall;
		switch (season) {
		case fall:
			System.out.println(Season.fall);
			break;
		case winter:
			System.out.println(Season.winter);
			break;
		default:
			System.out.println("No season");
		}
	}
}
