package fresh.serialize;

import java.io.Serializable;

public class Employee extends superEmployee implements variableConstant {
	public String firstName;
	public static String email="a@b.com";
	private static final long serialVersionUID = 5462223600l;
}

class superEmployee implements Serializable {
	public String lastName;
	static String companyName;
	transient String address ="abc";
	static transient String companyCEO;
}

interface variableConstant  {
	public static final String education = "MCA";
 
}