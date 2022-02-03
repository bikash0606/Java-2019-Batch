package com.bikash.flag;

import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) throws Exception {
		ServerSocket socket = new ServerSocket(5000);
		Socket serverSocket= socket.accept();
		DataInputStream inputData = new DataInputStream(serverSocket.getInputStream());
		System.out.println("Server Echo: " + (String)inputData.readUTF());
		socket.close();
	}
}
