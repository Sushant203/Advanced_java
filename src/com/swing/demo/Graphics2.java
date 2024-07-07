package com.swing.demo;

import javax.swing.JFrame;

public class Graphics2 {
	JFrame frame;
	MyPanel p;
	Graphics2(){
		frame= new JFrame();
		p= new MyPanel();
		frame.add(p);
		frame.setVisible(true);
		frame.setSize(400, 400);
	}
	public static void main(String[] args) {
		
		 new Graphics2();
	}

}
