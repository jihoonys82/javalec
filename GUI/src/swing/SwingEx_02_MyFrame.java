package swing;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingEx_02_MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel lbl;
	
	private Button btn1;
	private JButton btn2;
	private JButton btn3;
	
	private SwingEx_02_MyFrame() {
		
		setTitle("GUI Program_02_MyFrame");
		
		setLocation(100,100);
		setSize(500, 500);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(2,2));
		
		initFrame();
		initEvent();
		
		setVisible(true);
		
	}
	
	private void initEvent() {
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("Button 2 is pressed!");
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("Button 3 is pressed!");
			}
		});
		
	}

	private void initFrame() {
		// 3 buttons and 1 label
		lbl = new JLabel("Label");
		lbl.setHorizontalAlignment(JLabel.CENTER);
		
		btn1 = new Button("Button1"); // AWT component
		btn2 = new JButton("Button2"); // Swing component 
		btn3 = new JButton("Button3");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(lbl);
	}

	public static void main(String[] args) {
		new SwingEx_02_MyFrame();// call frame
	}
	
}
