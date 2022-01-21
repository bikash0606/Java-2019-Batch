import java.io.*;
import java.net.*;

class Server
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(5556);

		Socket serverSocket = ss.accept();
		String serverMessage;
		do {
			DataInputStream in = new DataInputStream(serverSocket.getInputStream());
			System.out.println("Message from client: " + (String) in.readUTF());

			DataOutputStream out = new DataOutputStream(serverSocket.getOutputStream());

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        	serverMessage = br.readLine();

			out.writeUTF(serverMessage);
			out.flush();		
		}while(!serverMessage.equals("exit"));

		serverSocket.close();
	}
}
