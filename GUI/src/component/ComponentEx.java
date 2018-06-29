package component;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
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
import javax.swing.border.BevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class ComponentEx extends JFrame {

	private ComponentEx() {
		setBounds(100,100, 100,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(null);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_0 :
					System.out.println("0 pressed.");
					break;
				case KeyEvent.VK_1 : jTextAreaEx();	break;
				case KeyEvent.VK_2 : jTextFieldEx(); break;
				case KeyEvent.VK_3 : jPasswordFieldEx(); break;
				case KeyEvent.VK_4 : jButtonEx(); break;
				case KeyEvent.VK_5 : jCheckBoxEx(); break;
				case KeyEvent.VK_6 : jRadioButtonEx(); break;
				case KeyEvent.VK_7 : jListEx(); break;
				case KeyEvent.VK_8 : jComboBoxEx(); break;
				}
			}

		});
		
		
		setVisible(true);
	}

	// VK_1
	private void jTextAreaEx() {
		JTextArea txtArea = new JTextArea();
		txtArea.setColumns(10); // set width
		txtArea.setRows(20); // set height
		txtArea.setLineWrap(true); // line wrap forced casting in column width.
		txtArea.setEditable(true); // set editable(default: true)
		txtArea.setText("Hello");
		String str = txtArea.getText();
		System.out.println(str);
		newJFrame(txtArea); 
		
	}
	
	// VK_2
	private void jTextFieldEx() {
		JTextField txt = new JTextField();
		txt.setColumns(20);
		
		// -- Placeholder -- 
		txt.setText("Input ID :) ");
		txt.setForeground(Color.GRAY);
		txt.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				// fill placeholder text again if there is no text. 
				if(txt.getText().isEmpty()) {
					txt.setText("Input ID :) ");
					txt.setForeground(Color.GRAY);
				}
			}
			@Override
			public void focusGained(FocusEvent e) {
				// Delete text when the text field is focused.
				if(txt.getText().equals("Input ID :) ")) {
					txt.setText("");
					txt.setForeground(Color.BLACK);					
				}
			}
		});
		
		//------------------
		
		JPanel pane = new JPanel();
		pane.add(txt);
		
		JButton btn = new JButton("Hahaha");
		pane.add(btn);
		
		newJFrame(pane);
		
		//below has to be placed after newJFrame() method call.
		btn.requestFocus(); //button get Focus.
	}

	// VK_3
	private void jPasswordFieldEx() {
		JPasswordField pass = new JPasswordField("TEST",20);
		System.out.println(pass.getPassword()); // getText() is deprecated. 
		newJFrame(pass);
	}
	
	// VK_4
	private void jButtonEx() {
		JButton btn = new JButton("Button");
		
		btn.setToolTipText("Transfer..");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Clicked!");
			}
		});
		
		btn.setPreferredSize(new Dimension(300, 400));
		
		btn.doClick();
		btn.doClick();
		btn.doClick();
		btn.doClick();
//		btn.doClick(1000);
		newJFrame(btn);
	}

	// VK_5
	private void jCheckBoxEx() {
		JPanel pane = new JPanel();
		pane.setPreferredSize(new Dimension(400,100));
		JCheckBox checkbox1 = new JCheckBox("Ice Americano");
		JCheckBox checkbox2 = new JCheckBox("Melon Juice");
		JCheckBox checkbox3 = new JCheckBox("Ice Chocolate");
		
		JTextField txt = new JTextField();
		txt.setColumns(25);
		
		checkbox1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) { 
					txt.setText(txt.getText() + "Ice Americano ");
				} else if(e.getStateChange()==ItemEvent.DESELECTED) {
					String str = txt.getText().replaceAll("Ice Americano ", "");
					txt.setText(str);
				}
			}
		});
		checkbox2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) { 
					txt.setText(txt.getText() + "Melon Juice ");
				} else if(e.getStateChange()==ItemEvent.DESELECTED) {
					String str = txt.getText().replaceAll("Melon Juice ", "");
					txt.setText(str);
				}
			}
		});
		checkbox3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) { 
					txt.setText(txt.getText() + "Ice Chocolate ");
				} else if(e.getStateChange()==ItemEvent.DESELECTED) {
					String str = txt.getText().replaceAll("Ice Chocolate ", "");
					txt.setText(str);
				}
			}
		});
		
		pane.add(checkbox1);
		pane.add(checkbox2);
		pane.add(checkbox3);
		pane.add(txt);
		
		newJFrame(pane);
	}
	
	// VK_6
	private void jRadioButtonEx() {
		JPanel pane = new JPanel();
		pane.setPreferredSize(new Dimension(400,100));
		JRadioButton rb1 = new JRadioButton("Ice Americano");
		JRadioButton rb2 = new JRadioButton("Melon Juice");
		JRadioButton rb3 = new JRadioButton("Ice Chocolate");
		JTextField txt = new JTextField();
		txt.setColumns(20);
	
		ButtonGroup rbGroup = new ButtonGroup();
		rbGroup.add(rb1);
		rbGroup.add(rb2);
		rbGroup.add(rb3);
		
		rb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) { 
					txt.setText(txt.getText() + "Ice Americano ");
				} else if(e.getStateChange()==ItemEvent.DESELECTED) {
					String str = txt.getText().replaceAll("Ice Americano ", "");
					txt.setText(str);
				}
			}
		});
		rb2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) { 
					txt.setText(txt.getText() + "Melon Juice ");
				} else if(e.getStateChange()==ItemEvent.DESELECTED) {
					String str = txt.getText().replaceAll("Melon Juice ", "");
					txt.setText(str);
				}
			}
		});
		rb3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) { 
					txt.setText(txt.getText() + "Ice Chocolate ");
				} else if(e.getStateChange()==ItemEvent.DESELECTED) {
					String str = txt.getText().replaceAll("Ice Chocolate ", "");
					txt.setText(str);
				}
			}
		});
		
		pane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		
		pane.add(rb1);
		pane.add(rb2);
		pane.add(rb3);
		pane.add(txt);
		
		newJFrame(pane);
	}
	
	// VK_7
	private void jListEx() {
		JPanel pane = new JPanel();
		pane.setPreferredSize(new Dimension(400,200));
		
		String[] str = {"½Å¶ó¸é", "Áø¶ó¸é", "¿ÀÂ¡¾îÂ«»Í", "¿Õ¶Ñ²±"};
		
		JList<String> jList = new JList<>(str);
		jList.setPreferredSize(new Dimension(100,150));
//		jList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		
		JTextField txt = new JTextField();
		txt.setColumns(20);
		
		jList.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(jList.getValueIsAdjusting()) {
					txt.setText(jList.getSelectedValue());
				}
			}
		});
		
		pane.add(jList);
		pane.add(txt);
		newJFrame(pane);
	}
	
	// VK_8
	private void jComboBoxEx() {
		JPanel pane = new JPanel();
		pane.setPreferredSize(new Dimension(400,200));
		
		String[] str = {"½Å¶ó¸é", "Áø¶ó¸é", "¿ÀÂ¡¾îÂ«»Í", "¿Õ¶Ñ²±"};
		JComboBox<String> cb = new JComboBox<>(str);
		
		JTextField txt = new JTextField(cb.getSelectedItem().toString());
		txt.setColumns(15);
		
		JButton btnEdit = new JButton("Edit");
		
		cb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				txt.setText(e.getItem().toString());
			}
		});
		
		txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					btnEdit.doClick();
				}
			}
		});
		
		btnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String str = txt.getText();
				int idx = cb.getSelectedIndex();
				if(!str.equals(cb.getSelectedItem())) {
					cb.insertItemAt(str, idx);
					cb.removeItemAt(idx+1);
					cb.validate();
					cb.repaint();
				}
			}
		});
		
		pane.add(cb);
		pane.add(txt);
		pane.add(btnEdit);
		
		newJFrame(pane);
	}
	
	private void newJFrame(JComponent c) {
		JFrame frame = new JFrame("Component Test");
		frame.setBounds(200, 100, 500, 500);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("./src/component/test.jpg");
		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(img.getImage(), 0, 0, getSize().width, getSize().height, null);
				setOpaque(false); //set opaque (default: true), 
				super.paintComponent(g);
			}
		};
		
		
//		JPanel pane = new JPanel();
//		pane.add(c);
		
		panel.add(c);
		
		frame.getContentPane().add(panel);
		
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new ComponentEx();
	}
	
}
