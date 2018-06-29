package swingEtc;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingEtc_06_MyDialog extends JDialog 
		implements ActionListener {
	
	private JButton btnOk;
	private JButton btnCancel;
	
	public SwingEtc_06_MyDialog(
			JFrame owner,
			String title,
			boolean modal,
			int x, int y ) {
		
		super(owner, title, modal);
		setLocation(x, y);
		
		setLayout(new GridLayout(2, 0));
		
		JLabel message = new JLabel("�����Ͻðڽ��ϱ�?",
								JLabel.CENTER);
		add(message);
		
		JPanel pane = new JPanel();

		btnOk = new JButton("Ȯ��");
		btnCancel = new JButton("���");
		
		pane.add(btnOk);
		pane.add(btnCancel);
		
		add(pane);
		
		// pack : set size followed by component size
		pack();
		
		btnOk.addActionListener(this);
		btnCancel.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == btnOk ) {
			System.exit(0);
		} else if( e.getSource() == btnCancel ) {
			dispose();
		}
	}
}














