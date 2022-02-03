package com.bikash.flag;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException{
		Socket socket = new Socket("localhost", 5000);
		DataOutputStream outputData = new DataOutputStream(socket.getOutputStream());
		outputData.writeUTF("Hello fom clilent");
		outputData.flush();
		outputData.close();
		socket.close();
	}

}
