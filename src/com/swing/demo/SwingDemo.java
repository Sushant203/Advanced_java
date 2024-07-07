package com.swing.demo;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingDemo implements ActionListener{
	JFrame frame;
	JLabel num1,num2,result;
	JTextField firstnum,secondnum,txtres;
	JButton btn,diff,product,div;
	
	public SwingDemo() {
		frame= new JFrame();
		num1= new JLabel("First number");
		num2= new JLabel("Second number");
		firstnum=new JTextField(20);
		secondnum=new JTextField(20);
		result= new JLabel("Result");
		txtres= new JTextField(20);
		txtres.setEditable(false);
		btn=new JButton("Add");
		diff=new JButton("Subtract");
		product=new JButton("Multiply");
		div=new JButton("Division");
		frame.setLayout(new FlowLayout());
		frame.setSize(300, 300);
		frame.setVisible(true);
		
//		adding component to frame
		 frame.add(num1);
	        frame.add(firstnum);
	        frame.add(num2);
	        frame.add(secondnum);
	        frame.add(result);
	        frame.add(txtres);
	        frame.add(btn);
	        frame.add(diff);
	        frame.add(product);
	        frame.add(div);
		
		btn.addActionListener(this);
		diff.addActionListener(this);
		product.addActionListener(this);
		div.addActionListener(this);
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		int num1= Integer.parseInt(firstnum.getText());
		int num2= Integer.parseInt(secondnum.getText());
		if(e.getSource()== btn) {
			
		int sum= num1+num2;
		txtres.setText(String.valueOf(sum));
		}
		else if(e.getSource()== diff) {
			
			int subtract= num1-num2;
		txtres.setText(String.valueOf(subtract));
		}
		else if(e.getSource()== product) {
			
			int product= num1*num2;
		txtres.setText(String.valueOf(product));
		}
		else if(e.getSource()== div) {
			 if (num2 != 0) {
                int division = num1 / num2;
                txtres.setText(String.valueOf(division));
            } else {
                txtres.setText("Error: Division by zero");
            }
		}
	}
	public static void main(String[] args) {
		new SwingDemo();

	}

}
