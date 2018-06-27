package event;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class EventEx_05_KeyEvent extends JFrame implements KeyListener {
	
	private JTextArea area;
	private JTextField txt;
	private JScrollPane spane;
	
	public EventEx_05_KeyEvent() {
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		area = new JTextArea();
		area.setEditable(false);
		area.setBackground(Color.GRAY);
//		add(area, "Center");
		
		spane = new JScrollPane(area);
		add(spane,"Center");
		
		txt = new JTextField();
		add(txt,"South");
		
		txt.addKeyListener(this);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventEx_05_KeyEvent();
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_ENTER) {
			System.out.println("Transfer");
			String str = txt.getText();
			area.setText(area.getText() + '\n' + str);
			txt.setText("");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}
}
