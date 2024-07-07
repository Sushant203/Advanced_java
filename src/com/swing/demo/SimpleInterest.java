package com.swing.demo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleInterest implements ActionListener {
	JFrame frame;
	JLabel labelp,labelt,labelr,result;
	JTextField txtp,txtr,txtt,txtres;
	JButton btn;
 SimpleInterest(){
	 frame= new JFrame();
	 labelp= new JLabel("principal");
	 labelt= new JLabel("time");
	 labelr= new JLabel("Rate");
	 result= new JLabel("Result");
	 txtp= new JTextField(20);
	 txtt= new JTextField(20);
	 txtr= new JTextField(20);
	 txtres= new JTextField(20);
	 txtres.setEditable(false); //make the result field uneditable by user
	 btn= new JButton("calculate");
	 frame.setLayout(new FlowLayout());
	 frame.add(labelp);
	 frame.add(txtp);
	 frame.add(labelr);
	 frame.add(txtr);
	 frame.add(labelt);
	 frame.add(txtt);
	 frame.add(result);
	 frame.add(txtres);
	 frame.add(btn);
	 frame.setVisible(true);
	 frame.setSize(200,200);
	 btn.addActionListener(this);
 }


	@Override
	public void actionPerformed(ActionEvent e) {
		
		int p= Integer.parseInt(txtp.getText());
		int t= Integer.parseInt(txtt.getText());
		int r= Integer.parseInt(txtr.getText());
		int si= (p*t*r)/100;
		txtres.setText(String.valueOf(si));		
	}
	public static void main(String[] args) {
		
		new SimpleInterest();
	}

}
	


