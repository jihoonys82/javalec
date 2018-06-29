package swingEtc;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingEtc_06_MyDialogEx extends JFrame {

	private SwingEtc_06_MyDialogEx() {
		setBounds(100, 50, 500, 500);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		Container root = getContentPane();
		
		JPanel pane = new JPanel();
		JButton openBtn = new JButton("���̾�α� ����");
		pane.add(openBtn);
		
		root.add(pane);
		
		// DIALOG control 
		// modal: true - parent window is locked(unselectable), false - can use parent window.
		// modaless : even though new window is opened, parent window is available to use. 
		JDialog dialog = new SwingEtc_06_MyDialog(
				this, "����� ���̾�α�", true,
				getX()+50, getY()+50);
		
		openBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dialog.setVisible(true);
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingEtc_06_MyDialogEx();
	}
}






