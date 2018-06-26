package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx_03_LayoutManager extends JFrame {
	
	private SwingEx_03_LayoutManager() {
	
		setTitle("Layout Example"); // window title
		setLocation(200,200);
		setSize(500,500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// -- Frame configuration --
//		flowLayoutEx();
		
//		borderLayoutEx();
		
		gridLayoutEx();
		// -------------------------
		
		setVisible(true); // it is recommended to use the end of configuration, some component may not be rendered well.
		
	}

	private void gridLayoutEx() {
//		setLayout(new GridLayout());
//		setLayout(new GridLayout(3, 0));
//		setLayout(new GridLayout(0, 3));
		setLayout(new GridLayout(0, 3, 10, 20));
		
		JButton[] btn = new JButton[8];
		for(int i=0;i<btn.length;i++) {
			btn[i] = new JButton("Button " + (i+1));
		}
		
		for(int i=0;i<btn.length;i++) {
			add(btn[i]);
		}
	}

	@SuppressWarnings("unused")
	private void borderLayoutEx() {
//		setLayout(new BorderLayout()); // it dosen't needed because default setting is BorderLayout
		setLayout(new BorderLayout(30,15));
		
		JButton[] btn = new JButton[5];
		for(int i=0;i<btn.length;i++) {
			btn[i] = new JButton("Button " + (i+1));
		}
//		add(btn[0]);
		add(btn[0], "East");
		add(btn[1], "West");
		add("Center", btn[2]);
		add(btn[3], BorderLayout.NORTH);
		add(BorderLayout.SOUTH, btn[4]);
		
	}

	@SuppressWarnings("unused")
	private void flowLayoutEx() {
//		setLayout(new FlowLayout());
//		setLayout(new FlowLayout(FlowLayout.RIGHT));
		setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
		
		add(new JButton("button3"));
		add(new JButton("button1"));
		add(new JButton("button5"));
		add(new JButton("button2"));
		add(new JButton("button7"));
		add(new JButton("button4"));
		add(new JButton("button6asfasdfasdfa"));
		
		JButton btn = new JButton("button8");
//		btn.setSize(200, 200); // it dose not take effect on the size.
		btn.setPreferredSize(new Dimension(200, 200));
		add(btn);
		
	}
	
	public static void main(String[] args) {
		new SwingEx_03_LayoutManager();
	}
}
