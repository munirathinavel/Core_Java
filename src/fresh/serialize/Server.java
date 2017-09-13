package fresh.serialize;

import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * This example shows how to use sockets to send and receive objects. This file
 * contains the class Server, which does the receiving of objects from class
 * WriteSocket in file WriteSocket.java The Server has to run first and wait for
 * the WriteSocket to send the information.
 *
 * Compiled and Tested with JDK1.1 & JDK1.2
 */
public class Server {

	/**
	 * Create the serversocket and use its stream to receive serialized objects
	 */
	public static void main(String args[]) {

		ServerSocket ser = null;
		Socket soc = null;
		String str = null;
		Date d = null;

		try {
			ser = new ServerSocket(8020);
			/*
			 * This will wait for a connection to be made to this socket.
			 */
			soc = ser.accept();
			InputStream o = soc.getInputStream();
			ObjectInput s = new ObjectInputStream(o);
			str = (String) s.readObject();
			d = (Date) s.readObject();
			EmployeeObject emp = (EmployeeObject) s.readObject();
			System.out.println("emp.count==" + emp.count);
			s.close();

			// print out what we just received
			System.out.println(str);
			System.out.println(d);
			System.out.println(emp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error during serialization");
			System.exit(1);
		}
	}
}