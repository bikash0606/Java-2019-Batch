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
