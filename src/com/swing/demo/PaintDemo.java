package com.swing.demo;

import java.awt.Graphics;

import javax.swing.*;

public class PaintDemo extends JPanel {
JPanel p;
JFrame frame;

	 PaintDemo() {
		p= new JPanel() {
			 @Override
				public void paint(Graphics g) {
					super.paint(g);
					g.drawOval(10, 10, 100, 20);
					g.drawRoundRect(15, 10, 50, 60, 50, 60);
				}
		};
		frame= new JFrame();
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.add(p);
		
	}
	
	 
	 public static void main(String[] args) {
		new PaintDemo();
	}

}
