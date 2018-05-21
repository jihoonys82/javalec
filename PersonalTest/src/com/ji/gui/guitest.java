package com.ji.gui;

import java.awt.Button;
import java.awt.Frame;
//import java.awt.Panel;

public class guitest {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		f.setSize(300, 300);
		Button button = new Button("press");
		//button.setSize(100, 100);
		f.setVisible(true);
		f.add(button);
		
		
	}
	
}