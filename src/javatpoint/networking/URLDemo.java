package javatpoint.networking;

import java.io.IOException;
import java.net.URL;

public class URLDemo {

	public static void main(String[] args) throws IOException {

		URL url = new URL("http://www.javatpoint.com/java-tutorial");

		System.out.println(url.getProtocol());
		System.out.println(url.getFile());
		System.out.println(url.getHost());
		System.out.println(url.getPort());

		System.out.println(url.toString());
		System.out.println(url.getUserInfo());
		System.out.println(url.getContent().toString());
	}

}
