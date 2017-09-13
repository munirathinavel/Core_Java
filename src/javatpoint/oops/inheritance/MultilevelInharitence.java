package javatpoint.oops.inheritance;

class Electronics {
	void power() {
		System.out.println("turning on");

	}
}

class Mobile extends Electronics {
	void shopping() {
		System.out.println("buying new mobile");
	}
}

class Nokia extends Mobile {
	void gotoNokiaShowRoom() {
		System.out.println("i am buying nokia mobile");
	}

}

public class MultilevelInharitence {
	public static void main(String[] args) {
		Electronics a = new Electronics();
		a.power();
		Mobile b=new Mobile();
		b.shopping();
		Nokia c= new Nokia();
		c.gotoNokiaShowRoom();
	}
}
