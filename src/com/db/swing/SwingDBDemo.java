package com.db.swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingDBDemo implements ActionListener{
JFrame frame;
JLabel id,name,price;
JTextField txtname,txtprice,txtid;
JButton submit;
public SwingDBDemo() {
frame= new JFrame("Student Form");
id= new JLabel("id");
txtid= new JTextField(5);
name= new JLabel("Name");
txtname= new JTextField(30);
price= new JLabel("price");
txtprice= new JTextField(30);
submit= new JButton("submit");
frame.add(id);
frame.add(txtid);
frame.add(name);
frame.add(txtname);
frame.add(price);
frame.add(txtprice);
frame.add(submit);
frame.setVisible(true);
frame.setSize(500, 500);
frame.setLayout(new FlowLayout(1));
submit.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
public static void main(String[] args) {
	new SwingDBDemo();
}
}
