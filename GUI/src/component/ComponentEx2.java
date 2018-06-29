package component;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.html.HTMLDocument;

public class ComponentEx2 extends JFrame {
	public ComponentEx2() {
		setBounds(1400, 50, 100, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(null);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_0:
					System.out.println("0 ����");
					break;
					
				case KeyEvent.VK_1:	jTextAreaEx(); break;

				case KeyEvent.VK_2:	jTextFieldEx(); break;

				case KeyEvent.VK_3:	jPasswordFieldEx(); break;

				case KeyEvent.VK_4:	jButtonEx(); break;

				case KeyEvent.VK_5:	jCheckBoxEx(); break;

				case KeyEvent.VK_6:	jRadioButtonEx(); break;
				
				case KeyEvent.VK_7:	jListEx(); break;
				
				case KeyEvent.VK_8:	jComboBoxEx(); break;
				}
			}
		});
		
		setVisible(true);
	}
	
	// 1
	HTMLDocument html;
	JTextPane txtPane;
	private void jTextAreaEx() {
		JTextArea txtArea = new JTextArea();
		txtArea.setColumns(10);
		txtArea.setRows(20);

		txtArea.setLineWrap(true);

		// �ؽ�Ʈ �ǳ�
		txtPane = new JTextPane();
		txtPane.setContentType("text/html");	// html �νĵǵ��� ����
		txtPane.setPreferredSize(new Dimension(200, 100));	// ������ ����, �ٸ� ������� �ص���
		txtPane.setEditable(false);	// ���� �Ұ�
		
		// �ؽ�Ʈ �ֱ�
		txtPane.setText("");
		
		// �ؽ�Ʈ ����ִ� �޼ҵ�
		setText();
		
		newJFrame(txtPane);
	}

	private void setText() {
		// HTML������ �ν��� �� �ֵ��� HTMLDocument ��ü ������ 
		html = (HTMLDocument) txtPane.getStyledDocument();
		
		try {
			// insertAfterEnd() �޼ҵ� -> �������� �߰��ϴ� �޼ҵ�
			
			html.insertAfterEnd(
					html.getCharacterElement(html.getLength()), 
					"<font color=\"red\">�ȳ��ϼ���<br></font>");

			html.insertAfterEnd(
					html.getCharacterElement(html.getLength()), 
					"<font color=\"blue\">�ݰ�����<br></font>");

			html.insertAfterEnd(
					html.getCharacterElement(html.getLength()), 
					"<font color=\"orange\">�߰���<br></font>");
			
		} catch (BadLocationException | IOException e1) {
			e1.printStackTrace();
		}
	}
	
	// 2
	private void jTextFieldEx() {
		JTextField txt = new JTextField();
		txt.setColumns(20);

		JTextField t = new  JTextField();
		t.setColumns(20);
		
		// Placeholder �����
		txt.setText("ID�� �Է��ϼ���");
		txt.setForeground(Color.gray);
		
		// Placeholder ����
		txt.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				
				// �� JTextField�� Placeholder ���̱�
				if(txt.getText().isEmpty()){
					txt.setText("ID�� �Է��ϼ���");
					txt.setForeground(Color.gray);
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {

				// JTextField�� ��Ŀ���� ���� Placeholder���ֱ�
				if(txt.getText().equals("ID�� �Է��ϼ���")){
					txt.setText("");
					txt.setForeground(Color.black);
				}
			}
		});
		
		JPanel pane = new JPanel();
		
		pane.add(txt);
		JButton btn = new JButton("T-T");
		pane.add(btn);

		newJFrame(pane);

		// ��ư�� Focus ���
		// JFrame�� ������ ���Ŀ� Focus�� �ǰܾ��ؼ�
		// newJFrame(pane); ȣ�� �ڿ��� �۵���Ŵ
		btn.requestFocus();
	}
	
	//3
	public void jPasswordFieldEx() {
		JPasswordField pass = new JPasswordField("test", 20);
		
		System.out.println( pass.getPassword() );
		
		newJFrame(pass);
	}
	
	//4
	public void jButtonEx() {
		JButton btn = new JButton("��ư");

//		btn.setEnabled(false);
		btn.setToolTipText("�����մϴ�");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Clicked");
			}
		});
		
//		btn.setPreferredSize(new Dimension(300, 400));
		
		btn.doClick();
		
		newJFrame(btn);
	}
	
	// 5
	private void jCheckBoxEx() {
		// ���̽� �Ƹ޸�ī��, �����ֽ�, ���̽� ����
		// �����ϸ� CheckBox�� JTextField�� ���
		
		// ������ �� �߻��ϴ� �̺�Ʈ�� ����???

		JPanel pane = new JPanel();
		pane.setLayout(new BorderLayout());
		
		JPanel checkPane = new JPanel();
		JCheckBox check1 = new JCheckBox("���̽� �Ƹ޸�ī��");
		JCheckBox check2 = new JCheckBox("�����ֽ�");
		JCheckBox check3 = new JCheckBox("���̽� ����");

		JTextField txt = new JTextField();

		// ItemEvent -> ItemListener
		// itemStateChanged() �޼ҵ�
		
		ItemListener li = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				// JCheckBox��ü.isSelected() �޼ҵ�
				// e.getStatechange() == ItemEvent.SELECTED
				
				// JCheckBox��ü.getText()
				
				if(e.getSource() == check1 && check1.isSelected()) {
					txt.setText(check1.getText());
				} else if(e.getSource() == check2
						&& e.getStateChange() == ItemEvent.SELECTED) {
					txt.setText(check2.getText());
				} else if(e.getSource() == check3 && check3.isSelected()) {
					txt.setText(check3.getText());
				}
			}
		};
		
		check1.addItemListener(li);
		check2.addItemListener(li);
//		check3.addItemListener(li);
		
		check3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == check3 && check3.isSelected())
					txt.setText(check3.getText());
			}
		});
		
		checkPane.add(check1);
		checkPane.add(check2);
		checkPane.add(check3);

		pane.add(checkPane, "Center");
		pane.add(txt, "South");
		
		newJFrame(pane);
	}
	
	//6
	private void jRadioButtonEx() {
		// ���̽� �Ƹ޸�ī��, �����ֽ�, ���̽�����
		// �����ϸ� Radiobutton�� �ؽ�Ʈ�� JTextField
		// ������ �� �߻��ϴ� �̺�Ʈ�� ����???
		// �� �ȵǸ� ButtonGroup Class ã�ƺ���

		JPanel pane = new JPanel();
		pane.setLayout(new BorderLayout());
		
		JPanel radioPane = new JPanel();
		JRadioButton radio1 = new JRadioButton("���̽� �Ƹ޸�ī��");
		JRadioButton radio2 = new JRadioButton("�����ֽ�");
		JRadioButton radio3 = new JRadioButton("���̽� ����");
		
		// ButtonGroup ���� ���� ������
		// JRadioButton�� ���������� On/Off �� ó����
//		ButtonGroup bg = new ButtonGroup();
//		bg.add(radio1);
//		bg.add(radio2);
//		bg.add(radio3);

		JTextField txt = new JTextField();

		// ItemEvent -> ItemLisenter
		// itemStateChanged() �޼ҵ�
		
		ItemListener li = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getSource() == radio1) {
					txt.setText(radio1.getText());
				} else if(e.getSource() == radio2) {
					txt.setText(radio2.getText());
				} else if(e.getSource() == radio3) {
					txt.setText(radio3.getText());
				} 
			}
		};
		
		radio1.addItemListener(li);
		radio2.addItemListener(li);
		radio3.addItemListener(li);
		
		radioPane.add(radio1);
		radioPane.add(radio2);
		radioPane.add(radio3);

		
		// JPanel�� Border(�׵θ�) �����
		radioPane.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		
		pane.add(radioPane, "Center");
		pane.add(txt, "South");
		
		newJFrame(pane);
	}
	
	// 7
	private void jListEx() {
		// �Ŷ��, �����, ��¡��«��, �նѲ�
		// ������ List Item�� �ؽ�Ʈ�� �ֿܼ� ���
		// ������ �� �߻��ϴ� �̺�Ʈ�� ����???

		JPanel pane = new JPanel();
		pane.setLayout(new BorderLayout());

		Vector<String> v = new Vector<String>();
		v.add("�Ŷ��");
		v.add("�����");
		v.add("��¡��«��");
		v.add("�նѲ�");

		// JList �� listData�� Vector�� �ֱ�
		JList<String> list = new JList<String>(v);
//		JList<String> list = new JList<String>();
//		list.setListData(v);
		
		// JList�� ���ø�� ���ϱ�
		// shift �� ctrl �� ������ �������� �� ������ �޶���
		
		// ������ �ϳ��� ���� ����
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// �������� Item���� ����
//		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		// �������ִ� Item�� ���� (�⺻��)
//		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		JTextField txt = new JTextField();

		// ListSelectionEvent -> ListSelectionListener
		// valueChanged() �޼ҵ�
		
		ListSelectionListener li = new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				// 2���� �޽����� ������ isAdjusting ���°� �ٸ���
//				System.out.println(e);
				
				if(e.getSource() == list && e.getValueIsAdjusting()) {
					txt.setText(list.getSelectedValue());
					System.out.println(list.getSelectedValue());
				}
			}
		};
		
		list.addListSelectionListener(li);

		pane.add(list, BorderLayout.CENTER);
		pane.add(txt, BorderLayout.SOUTH);
		
		newJFrame(pane);
	}
	
	// 8
	private void jComboBoxEx() {
		// �Ŷ��, �����, ��¡��«��, �նѲ�
		// ������ List Item�� �ؽ�Ʈ�� �ֿܼ� ���
		// ������ �� �߻��ϴ� �̺�Ʈ�� ����???
		// �޺��ڽ��� �������� �����غ���, �����ϰ� ���� �Է� �� �̺�Ʈ �߻�???

		JPanel pane = new JPanel();
		pane.setLayout(new BorderLayout());

		Vector<String> v = new Vector<String>();
		v.add("�Ŷ��");
		v.add("�����");
		v.add("��¡��«��");
		v.add("�նѲ�");

		// Vector�� Item �ֱ�
		JComboBox<String> combo = new JComboBox<>(v);
		
		JTextField txt = new JTextField();
		
		// �������� ��� (�⺻�� : false)
		combo.setEditable(true);
		
		// ActionEvent -> ActionListener
		// actionPerformed() �޼ҵ�
		
		ActionListener li = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// JComboBox��ü.getSelectedItem()
				String str = (String) combo.getSelectedItem();
				txt.setText(str);
				
				// �ߺ� ����
				for(int i=0; i<combo.getItemCount(); i++) {
					if( combo.getItemAt(i).equals(str) )
						return;
				}
				
				combo.addItem(str);
			}
		};
		
		combo.addActionListener(li);
		
		pane.add(combo, BorderLayout.CENTER);
		pane.add(txt, BorderLayout.SOUTH);
		
		newJFrame(pane);
	}
	
	public void newJFrame(JComponent c) {
		JFrame frame = new JFrame("������Ʈ �׽�Ʈ");
		frame.setBounds(1500, 60, 500, 500);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		ImageIcon img = new ImageIcon("./src/component/mi.jpg");
		JPanel panel = new JPanel(){
			@Override
			protected void paintComponent(Graphics g) {
				Dimension d = getSize();
				g.drawImage(img.getImage(), 0, 0, d.width, d.height, null);
				
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		
//		panel.setLayout(null);
		panel.add(c);
		
//		frame.add(panel);
		frame.getContentPane().add(panel);
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComponentEx2();
	}
}
