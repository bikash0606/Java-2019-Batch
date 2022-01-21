import java.io.*;
import java.net.*;
import java.util.*;
class Client
{
	public static void main(String[] args) throws Exception
	{
		Socket clientSocket = new Socket("127.0.0.1", 5556);
		String clientMessage;
		do {
			DataOutputStream dout = new DataOutputStream(clientSocket.getOutputStream());

        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        	clientMessage = br.readLine();

			dout.writeUTF(clientMessage);
			dout.flush();

			DataInputStream din = new DataInputStream(clientSocket.getInputStream());

			System.out.println("Message from the Server : "+ (String) din.readUTF());
		}while(!clientMessage.equals("exit"));

		clientSocket.close();
	}
}
