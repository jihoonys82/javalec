package event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class EventEx_04_KeyEvent extends JFrame implements KeyListener {
	
	public EventEx_04_KeyEvent() {
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addKeyListener(this);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventEx_04_KeyEvent();
	}

	@Override
	public void keyTyped(KeyEvent e) {
//		System.out.println("Key Typed");
//		System.out.println("Key Typed: " + e.getKeyCode());
//		System.out.println("Key Type: " + e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("Key Pressed");
//		System.out.println("Key Press: " + e.getKeyCode());
//		System.out.println("Key Press: " + e.getKeyChar());
		
		if(e.getKeyCode() == KeyEvent.VK_A ) {
			System.out.println("A Pressed!");
		} else if (e.isAltDown() && e.getKeyCode() == KeyEvent.VK_X ) {
			System.out.println("System terminated!");
			System.exit(0);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
//		System.out.println("Key Released");
//		System.out.println("Key Release: " + e.getKeyCode());
	}
	
}
