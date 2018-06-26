package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SwingEx_05_JPanel extends JFrame {

	private SwingEx_05_JPanel() {
		setTitle("JPanel Example");
		setBounds(100, 100, 600, 400); // set location and size at one method. 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// -- Frame configuration --
		JPanel pane1 = new JPanel();
		pane1.add(new JButton("Button1"));
		pane1.add(new JButton("Button2"));
		pane1.add(new JButton("Button3"));
		
		add(pane1);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingEx_05_JPanel();
	}
	
}
