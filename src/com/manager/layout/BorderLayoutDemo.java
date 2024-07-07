package com.manager.layout;

import java.awt.BorderLayout;

import javax.swing.*;

public class BorderLayoutDemo {
JFrame frame;
JButton add,sub,mul,east;
BorderLayoutDemo(){
	frame= new JFrame();
	add= new JButton("North");
	sub= new JButton("Subtract");
	mul= new JButton("Multiply");
	east= new JButton("East");
	frame.add(add,BorderLayout.EAST);
	frame.add(sub,BorderLayout.WEST);
	frame.add(mul,BorderLayout.NORTH);
	frame.add(east,BorderLayout.SOUTH);
	 frame.setSize(300, 300);    
	    frame.setVisible(true);    
	}    
	

public static void main(String[] args) {    
    new BorderLayoutDemo();    
}    
}
