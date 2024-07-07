package com.swing.EventListener;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class KeyListenerDemo implements KeyListener {
JFrame frame;
JLabel lbltxt;
JTextField txt;
KeyListenerDemo(){
	frame= new JFrame();
	lbltxt= new JLabel("First Label");
	txt= new JTextField(20);
	frame.add(lbltxt);
	frame.add(txt);
	frame.setSize(300, 300);
	frame.setVisible(true);
	frame.setLayout(new FlowLayout());
	txt.addKeyListener(this);
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e.getKeyChar());
	System.out.println("key code:"+e.getKeyCode());
//	System.out.println("key code:"+e.getKey());
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
//	System.out.println("key is pressed");
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	//System.out.println("key is released");
}
public static void main(String[] args) {
	new KeyListenerDemo();
}
}
