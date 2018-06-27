package swing;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SwingEx_08_Dispose extends JFrame {
	
	private SwingEx_08_Dispose() {
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setVisible(true);

		//additional window
		JFrame another = new JFrame();
		another.setBounds(200, 200, 600, 400);
		another.setDefaultCloseOperation(EXIT_ON_CLOSE);
		another.setVisible(true);
				
	}
	
	public static void main(String[] args) {
		new SwingEx_08_Dispose();
	
	}
}
