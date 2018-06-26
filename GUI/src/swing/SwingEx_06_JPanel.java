package swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class LoginJPanel extends JPanel {
	
	public LoginJPanel(){
		add(new JButton("Button:)"));
	}
}


@SuppressWarnings("serial")
public class SwingEx_06_JPanel extends JFrame {

	private SwingEx_06_JPanel() {
		setTitle("JPanel Example");
		setBounds(100, 100, 600, 400); // set location and size at one method. 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0, 3));
		
		add(new LoginJPanel());
		add(new JPanel());
		add(new LoginJPanel());
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingEx_06_JPanel();
	}
	
}
