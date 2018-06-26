package swing;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SwingEx_04_Null_LM extends JFrame {
	
	private SwingEx_04_Null_LM() {
		setTitle("Null-LM Example");
		
//		setLocation(100,100);
//		setSize(600,400);
		setBounds(100, 100, 600, 400); // set location and size at one method. 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// -- Frame configuration --
		setLayout(null); // set null Layout (default is Border Layout) 
		
		JButton btn1 = new JButton("Button1");
		btn1.setLocation(new Point(100, 50));
		btn1.setSize(new Dimension(150, 50));
		add(btn1);
		
		JButton btn2 = new JButton("Button2");
//		btn2.setBounds(200, 200, 150, 80);
		btn2.setBounds(new Rectangle(120, 80, 150, 80));
		add(btn2);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingEx_04_Null_LM();
	}
}
