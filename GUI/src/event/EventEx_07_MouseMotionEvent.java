package event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class EventEx_07_MouseMotionEvent extends JFrame implements MouseMotionListener {
	
	public EventEx_07_MouseMotionEvent() {
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addMouseMotionListener(this);

		setVisible(true);
	}

	public static void main(String[] args) {
		new EventEx_07_MouseMotionEvent();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Drag : " + e.getX() + ", " + e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Move : " + e.getX() + ", " + e.getY());
	}

}
