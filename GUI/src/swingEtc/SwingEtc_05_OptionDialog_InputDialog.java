package swingEtc;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SwingEtc_05_OptionDialog_InputDialog
		extends JFrame 
		implements ActionListener {

	private JPanel pane;
	
	private JButton optionBtn;
	private JButton inputBtn; 
	
	private SwingEtc_05_OptionDialog_InputDialog() {
		setBounds(100, 50, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pane = new JPanel();
		pane.setLayout(new GridLayout(2, 0, 0, 20));
		
		optionBtn = new JButton("�ɼ�");
		optionBtn.addActionListener(this);
		inputBtn = new JButton("�Է�");
		inputBtn.addActionListener(this);
		
		pane.add(optionBtn);
		pane.add(inputBtn);
		
		Container root = getContentPane();
		root.add(pane);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == optionBtn ) {
			
			Object[] options = {"�ɼ�1","�ɼ�2","�ɼ�3"};
			
			int selected = JOptionPane.showOptionDialog(
				pane, // parent
				"�ɼ� ���̾�α�", // message
				"Option", // title
				JOptionPane.YES_NO_CANCEL_OPTION,//option
				JOptionPane.QUESTION_MESSAGE,//messageType
				null,//icon
				options, // �ɼǵ�
				options[0]); // �ɼ��� focus ������
			
			optionBtn.setText(selected + ":����");
//			optionBtn.setText((String)options[selected]);
			
		} else if ( e.getSource() == inputBtn ) {
			Object[] inputs = {"�Է�1", "�Է�2", "�Է�3"};
			
			String msg=(String)JOptionPane.showInputDialog(
					pane, //parent
					"�Է� ���̾�α�", //message
					"Input", //title
					JOptionPane.PLAIN_MESSAGE, //messageType
					null, //icon
					inputs, //selectionValues
					inputs[0]); //initialSelectionValue
			inputBtn.setText("����! " + msg);
		}
	}

	public static void main(String[] args) {
		new SwingEtc_05_OptionDialog_InputDialog();
	}
}











