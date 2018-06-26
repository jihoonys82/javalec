package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;

public class AwtEx {

	// Container	
	private Frame fr;
	
	// Component Label
	private Label lbl;
	
	// Component Button
	private Button btn1;
	private Button btn2;
	
	private AwtEx() {
		// -- Create Frame --
		fr = new Frame("myFrame"); //set Frame title 
		fr.setVisible(true); // set visible
		// ------------------
		
		// -- Frame Setting --
		fr.setLayout(new GridLayout(3,1)); //set Layout 
		fr.setLocation(200, 200); // location
		fr.setSize(500, 500); // frame size
		// -------------------
		
		// -- Frame Event -- 
		windowEvent();
		// ----------------- 
		
		// -- Set Component --
		showLabel();
		showButton();
		// ------------------- 
		
	}
	
	private void showLabel() {
		lbl = new Label(); // create label
		lbl.setText("This is Label"); // set label text
		
		lbl.setAlignment(Label.CENTER); //set alignment to Center
		lbl.setBackground(Color.gray); //set background colour
		
		fr.add(lbl); // add to frame 
	}
	
	private void showButton() {
		// Create Button
		btn1 = new Button("Hello"); 
		btn2 = new Button();
		btn2.setLabel("Welcome!");
		
		// Add button event
		buttonEvent();
		
		//Add button to Frame
		fr.add(btn1);
		fr.add(btn2);
	}

	private void buttonEvent() {
		// add event listener for b1
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(e);
				lbl.setText("btn1 is pressed!");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("btn2 is pressed!");
			}
		});
		
	}

	// window eventµî·Ï 
	private void windowEvent() {
		
//		WindowListener l;
		
		// WindowsListener is Interface, so when it is used as Object, it looks so messy. 
		// So, WindowAdapter abstract class can be used. There are methods implemented from WindowListener interfaces without any contents.
//		l = new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.out.println(e);
//				System.exit(0);
//			}
//		};
		
//		l = new WindowListener() {		
//			@Override
//			public void windowOpened(WindowEvent e) {}
//			@Override
//			public void windowIconified(WindowEvent e) {}
//			@Override
//			public void windowDeiconified(WindowEvent e) {}
//			@Override
//			public void windowDeactivated(WindowEvent e) {}
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//			@Override
//			public void windowClosed(WindowEvent e) {}
//			@Override
//			public void windowActivated(WindowEvent e) {}
//		};
		
//		fr.addWindowListener(l);
		
		//It can be shrieked likes below code : 
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	

	public static void main(String[] args) {
		new AwtEx();
	}
}
