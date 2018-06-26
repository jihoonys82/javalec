package swing;

import javax.swing.JFrame;

public class SwingEx_01_Basic {
	
	public static void main(String[] args) {
		// Frame creation
		JFrame frame = new JFrame("Swing GUI");
		
		// set frame location and size
		frame.setLocation(100, 100);
		frame.setSize(500, 500);
		
		// set visible
		frame.setVisible(true);
		
		// set frame closing event
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Default close operation 
		// EXIT_ON_CLOSE : program terminate 
		// DISPOSE_ON_CLOSE : close window (if the window is last, program terminated.)
		// HIDE_ON_CLOSE : close without terminate program. (Just hide) 
		// DO_NOTHING_ON_CLOSE : do nothing
		
	}
}
