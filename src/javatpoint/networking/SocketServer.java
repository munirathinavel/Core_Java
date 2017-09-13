package javatpoint.networking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(3334);
			Socket socket = serverSocket.accept();
			DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
			DataInputStream din = new DataInputStream(socket.getInputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String readString = "";
			String writeString = "";

			while (!readString.equals("stop")) {
				writeString = din.readUTF();
				System.out.println("Client Says:" + writeString);

				readString = br.readLine();
				dout.writeUTF(readString);
				dout.flush();

			}

			dout.close();
			din.close();
			socket.close();
			serverSocket.close();

		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
