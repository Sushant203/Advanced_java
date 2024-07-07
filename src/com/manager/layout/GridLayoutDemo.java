package com.manager.layout;

import java.awt.GridLayout;

import javax.swing.*;

public class GridLayoutDemo {
	JFrame frame;
	JButton btn1,btn2,btn3,btn4,btn5;
	GridLayoutDemo(){
		frame= new JFrame();
		btn1= new JButton("A");
		btn2= new JButton("B");
		btn3= new JButton("C");
		btn4= new JButton("D");
		btn5= new JButton("E");
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(2, 2, 10, 10));
	}
public static void main(String[] args) {
	new GridLayoutDemo();
}
}
