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
