package javatpoint.networking;

import java.net.*;
import java.io.*;

public class SocketClient {
	public static void main(String[] args) throws Exception {
			Socket socket = new Socket("localhost", 3334);
			DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
			DataInputStream din = new DataInputStream(socket.getInputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String readString = "",writeString = "";
			while (!readString.equals("stop")) {
				readString = br.readLine();
				dout.writeUTF(readString);
				dout.flush();
				writeString = din.readUTF();
				System.out.println("Server Says:" + writeString);
			}

			dout.close();
			din.close();
			socket.close();

	}
}
