## Shapes.java
````
package com.bikash.flag;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Shapes extends JFrame{
	Shapes(){
		setSize(900,900);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(50, 50, 200, 200);
		
		g.setColor(Color.RED);
		g.fillOval(300, 80, 200, 100);
		
		int x[]= {800,600,700};
		int y[]= {200,200,100};
		
		g.setColor(Color.BLUE);
		g.fillPolygon(x, y, 3);
		
		int x1[]= {200,300,350,300,200,150};
		int y1[]= {500,500,550,600,600,550};
		g.setColor(Color.PINK);
		g.fillPolygon(x1, y1, 6);
		
		int x2[]= {500,600,700,650,550};
		int y2[]= {500,400,500,600,600};
		g.setColor(Color.CYAN);
		g.fillPolygon(x2, y2, 5);
	}

	public static void main(String[] args) {
		new Shapes();
	}

}

````
## FlagOfNepal.java
````
package com.bikash.flag;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class FlagOfNepal extends JFrame{

	public FlagOfNepal() {
		setSize(1000, 900);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(400,120,10 ,400);
		
		int x[]={410,650,500,700,410};
		int y[]={120,250,250,420,420};
		g.setColor(Color.BLUE);
		g.fillPolygon(x,y,5);
		
		int x2[]= {420,610,470,670,420};
		int y2[]= {140,240,240,410,410};
		g.setColor(Color.RED);
		g.fillPolygon(x2,y2,5);
		
		g.setColor(Color.WHITE);
		g.fillOval(445, 300, 50, 50);
		g.fillArc(445, 175, 50, 50, 0, -180);
	}

	public static void main(String[] args) {
		new FlagOfNepal();
	}

}
````

## Server.java
````
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
````
## Client.java
````
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
````


