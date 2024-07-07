package com.swing.demo;

import javax.swing.SwingUtilities;

public class SwingInovkeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new FrameDeclaration();
				
			}
			
		});
	}

}
