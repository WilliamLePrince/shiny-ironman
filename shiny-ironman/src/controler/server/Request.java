package controler.server;

import java.net.Socket;

public class Request {
	protected Socket client;
	protected String[] data;
	
	public Request(Socket c, String[] d) {
		this.client = c;
		this.data = d;
	}
	
	public String toString() {
		return client + "'s request is" + data + ".";
	}
}
