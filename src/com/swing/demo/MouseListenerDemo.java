package com.swing.demo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MouseListenerDemo implements MouseListener {

	JFrame frame;
	MouseListenerDemo(){
		frame= new JFrame();
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.addMouseListener(this);
	}
	public static void main(String[] args) {
		new MouseListenerDemo();

	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouse enter vayo");
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouse bahira aayo");
		
	}

}
