package javatpoint.oops.thisEx;

class PassThisToMeothd {
	void m(PassThisToMeothd obj) {
		System.out.println("method is invoked");
	}

	void p() {
		m(this);
	}

	public static void main(String args[]) {
		PassThisToMeothd s1 = new PassThisToMeothd();
		s1.p();
	}
}