package com.swing.demo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;
 public class MyPanel extends JPanel{
	  
	 public void paint(Graphics g) {
		 g.drawRect(20, 30, 100, 80);
		 g.drawOval(30, 40, 70, 40);
		 g.setColor(Color.gray);
		 g.fillRect(60, 60, 80, 70);
		 g.setColor(Color.BLACK);
		 g.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 50));
		 g.drawString("Sushant Shrestha", 80, 10);
		 
		 Image image= new ImageIcon("gaurishankar.jpg").getImage();
//		 g.drawImage(image, 150, 150, 300, 300, null);
		 g.drawImage(image, 150, 150, 200, 200,null);
	 }
	 
 }


