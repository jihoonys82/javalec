package swingEtc;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SwingEtc_04_MessageDialog
		extends JFrame
		implements ActionListener{
	
	private JPanel pane;

	private JButton questionBtn;
	private JButton informationBtn;
	private JButton warningBtn;
	private JButton errorBtn;
	
	private SwingEtc_04_MessageDialog() {
		setBounds(100, 50, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container root = getContentPane();
		
		pane = new JPanel();
		pane.setLayout(new GridLayout(4, 0, 0, 20));
		
		questionBtn = new JButton("����");
		questionBtn.addActionListener(this);
		informationBtn = new JButton("����");
		informationBtn.addActionListener(this);
		warningBtn = new JButton("���");
		warningBtn.addActionListener(this);
		errorBtn = new JButton("����");
		errorBtn.addActionListener(this);
		
		pane.add(questionBtn);
		pane.add(informationBtn);
		pane.add(warningBtn);
		pane.add(errorBtn);
		
		root.add(pane);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingEtc_04_MessageDialog();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == questionBtn ) {
			JOptionPane.showMessageDialog(
					pane,
					"���� ��ȭ����",
					"Question",
					JOptionPane.QUESTION_MESSAGE);
		} else if( e.getSource() == informationBtn ) {
			JOptionPane.showMessageDialog(
					pane,
					"���� ��ȭ����",
					"Information",
					JOptionPane.INFORMATION_MESSAGE);
		} else if( e.getSource() == warningBtn ) {
			JOptionPane.showMessageDialog(
					pane,
					"��� ��ȭ����",
					"Warning",
					JOptionPane.WARNING_MESSAGE);
		} else if( e.getSource() == errorBtn ) {
			JOptionPane.showMessageDialog(
					pane,
					"���� ��ȭ����",
					"Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}
}
