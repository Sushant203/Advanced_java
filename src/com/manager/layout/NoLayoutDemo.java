

package com.manager.layout;

//import java.awt.FlowLayout;

import javax.swing.*;

public class NoLayoutDemo{
	JFrame frame;
	JButton add,sub,mul;
	NoLayoutDemo(){
		frame= new JFrame();
		add= new JButton("Add");
		sub= new JButton("Sub");
		mul= new JButton("Mul");
		frame.setSize(300,300);
		frame.setLayout(null);
		add.setBounds(50,50,80,20);
		sub.setBounds(50,80,80,20);
		mul.setBounds(50,110, 80,20);
		frame.add(add);
		frame.add(sub);
		frame.add(mul);
		
		frame.setVisible(true);
//		frame.setResizable(false);
		
		//make layout null
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
	}
	public static void main(String[] args) {
		new NoLayoutDemo();
	}
}