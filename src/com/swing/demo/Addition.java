package com.swing.demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Addition implements ActionListener{
	JFrame frame;
	JLabel lblA,lblB;
	JTextField num1,num2;
	JButton add;
	Addition(){
		 frame= new JFrame();
		 lblA= new JLabel("first number");
		 lblB= new JLabel("Second number");
		 num1= new JTextField("10");
		 num2= new JTextField("10");
		 add= new JButton("ADD");
		frame.setLayout(new FlowLayout());
		frame.add(lblA);
		frame.add(num1);
		frame.add(lblB);
		frame.add(num2);
		frame.add(add);
		frame.setVisible(true);
		frame.setSize(300,300);
		 add.addActionListener(this);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Addition();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	int	a= Integer.parseInt(num1.getText());
	int b= Integer.parseInt(num2.getText());
	int result= a+b;
	System.out.println("sum of two numbers is ="+ result);
		
	}

}
