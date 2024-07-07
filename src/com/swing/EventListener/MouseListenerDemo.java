package com.swing.EventListener;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.*;

public class MouseListenerDemo extends MouseAdapter {
JFrame frame;
JLabel lfirst,lsecond,result;
JTextField txtfirst,txtsecond;
JButton btn;
 MouseListenerDemo(){
	frame= new JFrame("mouse listener");
	lfirst= new JLabel("First Number");
	txtfirst= new JTextField(20);
	lsecond= new JLabel("Second Number");
	txtsecond= new JTextField(20);
	result= new JLabel("result");
	
	
	btn= new JButton("Add");
	frame.add(lfirst);
	frame.add(txtfirst);
	frame.add(lsecond);
	frame.add(txtsecond);
	frame.add(result);
	frame.add(btn);
	
	frame.setVisible(true);
	frame.setLayout(new FlowLayout());
	frame.setSize(400, 400);
	btn.addMouseListener(this);
	
 }

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("hello");
		int a= Integer.parseInt(txtfirst.getText());
		int b= Integer.parseInt(txtsecond.getText());
		 int res = a+ b;
		 result.setText("result" + res);
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mouse pressed!!");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		new MouseListenerDemo();
		}
	
}
