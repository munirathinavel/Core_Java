package fresh.serialize;

import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Date;

/**
 * This example shows how to use sockets and serialization to send objects that
 * will be received (see class Server to see the receiving part)
 *
 * Compiled and Tested with JDK1.1 & JDK1.2
 */
public class Client {

	public static void main(String args[]) {

		try {
			// Create a socket
			Socket soc = new Socket(InetAddress.getLocalHost(), 8020);

			// Serialize today's date to a outputstream associated to the socket
			OutputStream o = soc.getOutputStream();
			ObjectOutput s = new ObjectOutputStream(o);

			s.writeObject("Today's date");
			s.writeObject(new Date());
			s.writeObject(new EmployeeObject(1001, "Vel"));
			s.flush();
			s.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error during serialization");
			System.exit(1);
		}
	}
}
