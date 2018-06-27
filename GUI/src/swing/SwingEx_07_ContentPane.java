package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
public class SwingEx_07_ContentPane extends JFrame implements ActionListener {
	
	// -- variables for root container --
	private Container root; // root container
	
	// first panel
	private JPanel 	pane;
	private JButton btnHi;
	private JButton btnBye;
	private JButton btnChange;
	// ----------------------------------
	
	// second panel
	private JPanel 	pane2;
	private JPanel 	pane2sub;
	private JButton btnOk;
	private JButton btnCancel;
	private JButton btnChange2;
	private JLabel 	lbDesc;
	// ----------------------------------
	
	
	// -- variables for menu setting --
	private JMenuBar  menuBar; 	// menubar (ex. eclipse File ~ Help) 
	private JMenu	  menu; 	// menu - single item in menubar (ex. File or Edit in menubar)
	private JMenuItem item1;	// menuItem - each items in menu dropdown. 
	private JMenuItem item2;
	private JMenuItem item3;
	private JMenuItem exitItem;
	// --------------------------------
	
	
	private SwingEx_07_ContentPane() {
		setTitle("Top-Level Component Example");
		setBounds(100, 100, 600, 400); // set location and size at one method. 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// menu bar setting 
		initMenuBar();
		
		// Root container setting 
		initRootContainer();
		
		
		setVisible(true);
	}

	private void initRootContainer() {
		root = getContentPane();
		
		initPane(); // first panel setting 
		initPane2(); // second panel setting 
		
		root.add(pane);
		root.add(pane2);
		
	}

	private void initPane() {
		pane = new JPanel();
		
		btnHi = new JButton("Hi");
		pane.add(btnHi);
		btnHi.addActionListener(this);
		
		btnBye = new JButton("Bye");
//		pane.add(btnBye);
		btnBye.addActionListener(this);
		
		btnChange = new JButton("Change");
		pane.add(btnChange);
		btnChange.addActionListener(this);
	}

	private void initPane2() {
		pane2 = new JPanel();
		pane2sub = new JPanel();
		
		btnOk = new JButton("OK");
		btnCancel = new JButton("Cancel");
		btnChange2 = new JButton("Change");
		
		pane2.setLayout(new GridLayout(2,0));
		pane2sub.add(btnOk);
		pane2sub.add(btnCancel);
		pane2sub.add(btnChange2);
		
		pane2.add(pane2sub);
		
		lbDesc = new JLabel("This is second container");
		lbDesc.setHorizontalAlignment(JLabel.CENTER);
		
		pane2.setBackground(Color.CYAN);
		pane2.add(lbDesc);
		
		btnOk.addActionListener(this);
		btnCancel.addActionListener(this);
		btnChange2.addActionListener(this);
		
	}
	
	private void initMenuBar() {
		menuBar = new JMenuBar();
		menu = new JMenu("Menu");
		item1 = new JMenuItem("ITEM1");
		item2 = new JMenuItem("ITEM2");
		item3 = new JMenuItem("ITEM3");
		exitItem = new JMenuItem("Exit(x)");
		
		menu.setMnemonic('M');
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.addSeparator();
		menu.add(exitItem);
		
		menuBar.add(menu);
		
		// menuItem event 
		initExitItem(); // set exit button event
		
		setJMenuBar(menuBar);
		
	}

	private void initExitItem() {
		// Action Event method 
		exitItem.addActionListener(this);
		
		// Tool tip
		exitItem.setToolTipText("Close Program");
		
		// MNemonic (연상기호, 기억키) 
		exitItem.setMnemonic(KeyEvent.VK_X);

		// Accelerator (가속키, 단축키)
		// alt + q : Exit shortcut
		exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.ALT_MASK));
		
	}
	public static void main(String[] args) {
		new SwingEx_07_ContentPane();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == exitItem) {
			System.exit(0); // exit the program			
		} else if(e.getSource() == btnHi) {
			// remove hi button && activate bye button
			pane.remove(btnHi);
			pane.add(btnBye);
			pane.add(btnChange); // for retaining change button order;
			
			pane.validate(); // validate component (check the memory)
			pane.repaint(); // repaint panel
		} else if(e.getSource() == btnBye) {
			// remove bye button && activate hi button
			pane.remove(btnBye);
			pane.add(btnHi);
			pane.add(btnChange);
			
			pane.validate();
			pane.repaint();
		} else if(e.getSource() == btnChange) {
			root.remove(pane);
			root.add(pane2);
			
			root.validate();
			root.repaint();
		} else if(e.getSource() == btnOk) {
			lbDesc.setText("OK!!");
		} else if(e.getSource() == btnCancel) {
			lbDesc.setText("Cancel!!");
		} else if(e.getSource() == btnChange2) { 
			root.remove(pane2);
			root.add(pane);
			
			root.validate();
			root.repaint();
		}
		
	}
	
}
